package org.zalando.problem.spring.web.advice.http;

import org.apiguardian.api.API;
import org.zalando.problem.spring.web.advice.AdviceTrait;

import static org.apiguardian.api.API.Status.STABLE;

/**
 * @see AdviceTrait
 */
@API(status = STABLE)
public interface HttpAdviceTrait extends
        NotAcceptableAdviceTrait,
        UnsupportedMediaTypeAdviceTrait,
        MethodNotAllowedAdviceTrait {

}
