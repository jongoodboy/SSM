<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="ctxRes" value="${pageContext.request.contextPath}/static"/>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
<fmt:formatDate var="timeStampStr" value="<%= new java.util.Date() %>" type="both" dateStyle="long" pattern="yyyyMMddHHmmss" />
<c:set var="resVersion" value="${timeStampStr}"/>
<script>
    var ctx = "${ctx}";
    var ctxRes = "${ctxRes}";
    var ctxStatic = "${ctxStatic}";
    var resVersion = "${resVersion}";
    var path = "${path}";
    var basePath = "${basePath}";
</script>
<!-- 引入样式 -->
<link rel="stylesheet" href="${ctxRes}/elementUI/css/index.css">
<!--引入vue.js-->
<script src="${ctxRes}/js/vue.js"></script>
<!-- 引入组件库 -->
<script src="${ctxRes}/elementUI/js/index.js"></script>
<!--引入jQuery-->
<script src="${ctxRes}/js/jquery-1.9.1.min.js"></script>
