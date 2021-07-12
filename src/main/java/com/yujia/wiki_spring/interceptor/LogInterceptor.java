//package com.yujia.wiki_spring.interceptor;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class LogInterceptor implements HandlerInterceptor {
//    private static final Logger log = LoggerFactory.getLogger( LogInterceptor.class );
//    @Override
//     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//         // print request log
//         log.info("------------- LogInterceptor Start -------------");
//         log.info("Request Address: {} {}", request.getRequestURL().toString(), request.getMethod());
//         log.info("Remote Address: {}", request.getRemoteAddr());
//
//         long startTime = System.currentTimeMillis();
//         request.setAttribute("requestStartTime", startTime);
//         return true;
//         // Check Login Permissions
//     }
//
//     @Override
//     public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//         long startTime = (Long) request.getAttribute("requestStartTime");
//         log.info("------------- LogInterceptor End Runtime：{} ms -------------", System.currentTimeMillis() - startTime);
//     }
//}
