<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<title>Signup module....</title>
</head>
    <body style="background:url(img/imag1.jpg);background-size: cover;background-attachment:fixed">
  <div class="container">
     <div class="row">
        <div class="col m6 offset-m3">
             <div class="card">
                  <div class="card-content">
                     <h2 style="margin-top:10px;" class="center-align">Sign Up here!!</h2>
                  <h5 id="msg" class="center-align"></h5>
                   <div class="form center-align">
                   
                      <form action="Signup" method="post" id="myform" enctype="multipart/form-data">
                      <input type="text" name="username" placeholder="enter user name"/>
                      <input type="email" name="email" placeholder="enter user email"/>
     
                        <input type="password" name="password" placeholder="password "/>
             
     <div class="file-field input-field">
      <div class="btn blue">
        <span>File</span>
        <input type="file" name="image">
      </div>
      <div class="file-path-wrapper">
        <input class="file-path validate" type="text">
      </div>
    </div>

                          
                      <button type="submit" class="button red">Submit</button>
                      
                      
                      </form>
                      
                   
                   
                   
                   </div>
             <div class="loader center-align" style="margin-top:10px;display:none;">
                    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
                  
                  
                  </div> 
             <h4 style="margin-top:10px;" class="center-align">Please wait....</h4>                 
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  </div>
             </div>
        </div>
     </div>
  </div>
  <script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
  
  <script>
     $(document).ready(function(){
    	 console.log("Page is ready...") 
        
        $("#myform").on('submit',function(event){
             
           event.preventDefault();
          // var f=$(this).serialize();
            let f=new FormData(this);
            console.log(f);
            $(".loader").show();
            $(".form").hide();
            $.ajax({
                url:"Signup",
                data:f,
                type:'POST',
                success:function(data,textStatus,jqXHR){
                    console.log(data);
                    console.log("Success.....");
                    
                    $(".loader").hide();
                  $(".form").show();
                  
                  if(data.trim()==='Done')
                	  {
                	   $('#msg').html("Successfull Registred!!")
                          $('#msg').addClass('green-text')
                	  }
                    else{
                        $('#msg').html("Something Wrong!!")
                         $('#msg').addClass('red-text')
                    }
                   
                },
                error:function(jqXHR,textStatus,errorThrown){
                    console.log(data);
                    console.log("error.....");
                      $(".loader").hide();
                       $(".form").show();
                    
                    $('#msg').html("Something Wrong!!")
                     $('#msg').addClass('red-text')
                },
           processData:false,
            contentType:false
            })
             
             
         })
         
     })
      
  </script>
</body>
</html>