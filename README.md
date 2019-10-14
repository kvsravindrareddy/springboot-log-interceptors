# springboot-log-interceptors

Spring MVC allow you to intercept web request through handler interceptors. The handler interceptor have to implement the HandlerInterceptor interface, which contains three methods :

preHandle() – Called before the handler execution, returns a boolean value, “true” : continue the handler execution chain; “false”, stop the execution chain and return it.
postHandle() – Called after the handler execution, allow manipulate the ModelAndView object before render it to view page.
afterCompletion() – Called after the complete request has finished. Seldom use, cant find any use case.

ExecuteTimeInterceptor – Intercept the web request, and log the controller execution time.
MaintenanceInterceptor – Intercept the web request, check if the current time is in between the maintenance time, if yes then redirect it to maintenance page.
