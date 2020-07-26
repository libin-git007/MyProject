package com.li.org.loginFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginAccessFilter extends ZuulFilter {
    private static Logger log= LoggerFactory.getLogger(LoginAccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

       /* RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        log.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());

        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(404);
        ctx.setResponseBody("失败");*/

        return null;
    }
}
