<#macro page>
  <html>
  <head>
    <title>11</title>
  </head>
  <body>
    <h1>22</h1>
  
    <#-- This processes the enclosed content:  -->
    <#nested>
  </body>
  </html>
</#macro>

<#macro otherExample p1 p2>
  <p>The parameters were: ${p1}, ${p2}</p>
</#macro> 