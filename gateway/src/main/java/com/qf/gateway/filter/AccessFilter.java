package com.qf.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @Created by liur.
 * @Date: 2018/6/1
 * @Description:
 */
public class AccessFilter extends ZuulFilter {

    private static Logger logger= LoggerFactory.getLogger(AccessFilter.class);

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
    public Object run() {
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        logger.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());

        Object accessToken=request.getParameter("accessToken");
        if(accessToken==null){
            logger.info("access token is null");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            return null;
        }
        logger.info("access token ok");
        return null;
    }
}
