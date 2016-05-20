<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
<H2>
    <a href="http://viralpatel.net"><img height="37" width="236" border="0px" src="http://viralpatel.net/blogs/wp-content/themes/vp/images/logo.png" align="left"/></a>
    FreeMarker Spring MVC Hello World
</H2>
</div>
 
<div id="content">
     
  <fieldset>
    <legend>Add User</legend>
  <form name="user" action="index.html" method="post">
    Firstname: <input type="text" name="firstname" /> <br/>
    Lastname: <input type="text" name="lastname" />   <br/>
    <input type="submit" value="   Save   " />
  </form>
  </fieldset>
  <br/>
  <table class="datatable">
    <thead>
										<tr>
											<th>id</th>
											<th>服务名称</th>
											<th>配置名称</th>
											<th>版本号</th>
											<th>属性名</th>
											<th>属性值</th>
										</tr>
									</thead>
									<tbody>
									 <#list model["pconfigList"] as pconfigList>
										<tr class="odd gradeX">
											<td>${pconfigList.id}</td>
											<td>${pconfigList.aliases}</td>
											<td>${pconfigList.propName}</td>
											<td>${pconfigList.version}</td>
											<td>${pconfigList.attrName}</td>
											<td>${pconfigList.attrValue}</td>
										</tr>
										    </#list>
									</tbody>
   
  </table>
 
</div>  
</body>
</html>  