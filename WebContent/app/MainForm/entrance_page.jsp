<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<link rel="stylesheet" href="../PublicLib/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/entrance_page.css" />
	<script type="text/javascript" src="../PublicLib/js/jquery-3.1.1.min.js" ></script>
    <script type="text/javascript" src="../PublicLib/js/bootstrap.min.js" ></script>
    
    <script type="text/javascript" src="js/country.js" ></script>
    <script type="text/javascript" src="js/entrance_page.js" ></script>
    
    <script>
				
            	$(function(){
            	$("#register_input_province").click(function(){
            	$("#addr_selecters").modal("show");
            	  produce_addr();
            	}) 	
      })       				    
	</script>
		<title>Welcome!</title>
</head>
	
<body>	
		<div class="container-fluid">
			<div class="jumbotron">
				<h1 id="head_h1">欢迎登陆!</h1>
				<p class="lead" id="head_p">这是一个有趣的社群</p>
				<a id="login" class="btn btn-primary btn-lg"data-toggle="modal" data-target="#LoginModal"> <span class="glyphicon glyphicon-user"></span> 登陆</a>
				<a id="register" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#RegisterModal"> <span class="glyphicon glyphicon-edit"></span> 注册</a>
			</div>
			
			


</div>
		
			<script type="text/javascript" src="../PublicLib/js/jquery-3.1.1.min.js" ></script>
    <script type="text/javascript" src="../PublicLib/js/bootstrap.min.js" ></script>
    
    <script type="text/javascript" src="js/country.js" ></script>
    <script type="text/javascript" src="js/entrance_page.js" ></script>
    
    <script>
				
            	$(function(){
            	$("#register_input_province").click(function(){
            	$("#addr_selecters").modal("show");
            	  produce_addr();
            	}) 	
            	
            	$(document).ready(function(){
            		$('#register_alert').hide()
            	})
      })       				    
	</script>

<!-- 模态框（Modal） -->
<form role="form" id="login_form">

<div class="modal fade" id="LoginModal" >

<div class="modal-dialog" style="max-width: 400px;">
        <div class="modal-content">
            <div class="modal-header" id="login_header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="LoginModalLabel">登陆</h4>
            </div>
            <div class="modal-body">
            	<form class="form-horizontal" >
            		<div class="form-group" id="login_username_div"  >
            			<div class="col-sm-12" id="login_input_div">
            				<span style="position: absolute; right: 5%;" class="glyphicon glyphicon-user form-control-feedback"></span>
            				<input class="form-control" type="text" formaction="login_checking.jsp" name="login_username" class="form-control" id="login_input_username" placeholder="账号:" />
            			</div>
            		</div>  		
            		<div class="form-group" id="login_password_div"  >            			
            			<div class="col-sm-12" id="login_input_div2">
            				<span style="position: absolute; right: 5%;" class="glyphicon glyphicon-lock form-control-feedback"></span>
            				<input class="form-control" type="password" formaction="login_checking.jsp" name="login_password" class="form-control" id="login_input_password" placeholder="密码:" />
            			</div>
            		</div>
            	</form>
            </div>
            <div class="modal-footer" id="login_bottom">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary" formaction="login_checking.jsp">登陆</button>
            </div>
        </div><!-- /.modal-content -->
   </div><!-- /.modal --> 
</div>
</form>  
 <form onsubmit="return register_email_check()">
<div class="modal fade" id="RegisterModal">
		<div class="modal-dialog" style="max-width: 450px;">
		<div class="modal-content">
			<div class="modal-header" id="register_header">
				 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="RegisterModalLabel">注册</h4>
			</div>
			<div class="modal-body">
				<div class="form-horizontal"  style="position: relative; padding-left: 0%;">
					<div class="form-group" id="register_email_div" style="position: relative;">
						<div class="col-sm-12" id="register_input_div" style="position: relative;" >
							<span  style="position: absolute; left: 4%;margin: 0.3% 0;" class="glyphicon glyphicon-envelope form-control-feedback"></span>
							<input class="form-control" type="text" name="register_email"  formaction="register_checking.jsp" style="position: relative; padding-left:9% ;"  id="register_input_email" placeholder="输入邮箱" />
							
						</div>
					</div>
					

					
					<div class="form-group" id="register_adddr" style="position: relative;">
						<label for="register_input_div3" style="position: relative;left: 4%;">填写地址:</label>
						<div class="row">
							
						 <div class="col-xs-4" id="register_input_province_div"  style="position: relative; padding-left:8%;padding-right:0%;">
							<input type="text" formaction="register_checking.jsp" class="form-control " id="register_input_province" name="register_province"  data-toggle='modal'  placeholder="省（自治区）" /> 
							<script>
								
							</script>

						</div>	
						
						<div class="col-xs-4" id="register_input_town_div"  style="position: relative; padding-right:3%;padding-left: 3%;" >
							<input type="text" formaction="register_checking.jsp" class="form-control " id="register_input_town" name="register_town" placeholder="市" />
						</div>	
						
						<div class="col-xs-4" id="register_input_area_div"  style="position: relative; padding-right:8%;padding-left:0%;">
							<input  type="text" formaction="register_checking.jsp" class="form-control " id="register_input_area" name="register_area" placeholder="地区" />
						</div>
						</div>
						
					</div>
					
					<div class="form-group" id="register_password">
						 <div class="col-sm-12" id="register_input_div2">
							<span  style="position: absolute; left: 4%;margin: 0.3% 0;" class="glyphicon glyphicon-lock form-control-feedback"></span>
							<input style="padding-left:9% ;" formaction="register_checking.jsp" type="password" class="form-control" id="register_input_password" name="register_password" placeholder="输入密码" />
						</div>
					</div>
					
					<div class="form-group" id="register_repassword_div">
						 <div class="col-sm-12" id="register_input_div3">
							<span  style="position: absolute; left: 4%;margin: 0.3% 0;" class="glyphicon glyphicon-lock form-control-feedback"></span>
							<input formaction="register_checking.jsp" style="padding-left:9% ;" type="password" class="form-control" id="register_input_repassword" name="register_password" placeholder="确认密码" />
						</div>
					</div>
				</div>
				<div class="alert alert-warning" id="register_alert">
					<a href="#" class="close" data-dismiss="alert">&times;</a>
					<strong>警告！</strong>您的网络连接有问题。
				</div>

			   </div>								
			<div class="modal-footer" id="register_bottom" >
				 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary" formaction="register_checking.jsp" style="position: relative;" >注册</button>
              
			</div>
		</div>
	</div>
</div>
<script>
     function register_email_check(){
        var checked_sum=false;
        var checked_sum_2=false;
     	var input_email=$('#register_input_email').val();
     	var input_password=$('#register_input_password').val();
        var input_repassword=$('#register_input_repassword').val();
        if(input_email.indexOf('@')==-1){
       	  
       	    $('#register_email_div').attr('class',"form-group has-error");
       	  $('#register_input_email').val("");
       	  $('#register_input_email').attr('placeholder','邮箱格式错误');
       	 checked_sum=false;
        }
        else{
        	 checked_sum=true;
        	  $('#register_email_div').attr('class',"form-group has-success");
        }
        
        if(input_password!=input_repassword||!input_password||!input_repassword){
        	checked_sum_2=false;
        	$('#register_input_repassword').val("")
        	if('input_password!=input_repassword'){
        		$('#register_input_repassword').attr('placeholder','密码输入错误');
        	}
        	if(!input_repassword){
        		$('#register_input_repassword').attr('placeholder','密码输入不为空');
        	}
        	$('#register_repassword_div').attr('class','form-group has-error')
        }
        else{
        	checked_sum_2=true;
        	$('#register_repassword_div').attr('class','form-group has-success')
        }
        if(checked_sum==true&&checked_sum_2==true){
        	return true;
        }
        else{
        	return false;
        }
     	
     }
</script>
</form>
<div class="modal fade  " id='addr_selecters'>  
                    <div class="modal-dialog" style="max-width: 950px;">  
                        <div class="modal-content">  
                        	<div class="modal-header" id="register_header">
				            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="RegisterModalLabel">注册</h4>
                        	</div>
                            <div class="modal-body" id="addr_selecters_body">
                            	<script>
                            	</script>
                            </div>  
                            <div class="modal-footer">    
                         </div>  
                  </div>  
          </div>  
  </div>

<div class="page-header">
    <h2 id="h1" class="bs-docs-featurette-title">活跃  高效的社区<br />
        <small id="small_1" ><p class="lead" id="smallp_1">连接更多的智慧 </p></small>
    </h2>
    <p>这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。</p>
<br /><br /><br />
</div>


<div class="page-header">
    <h1 id="h2" class="bs-docs-featurette-title">页面标题实例<br/>
        <small  id="small_2"><p class="lead" id="smallp_2">连接更多的智慧 </p></small></small>
    </h1>
    
    <p>这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。</p>
<br /><br /><br />
</div>


<div class="page-header">
    <h1 id="h3" class="bs-docs-featurette-title">页面标题实例<br />
        <small  id="small_3"><p id="smallp_3" class="lead">连接更多的智慧 </p></small></small>
    </h1>
  
    <p>这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。这是一个示例文本。</p>
<br /><br /><br />
</div>

	</body>
</html>