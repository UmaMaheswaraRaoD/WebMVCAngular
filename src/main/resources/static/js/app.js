var app=angular.module("myapp",['ui.router']);

app.config(function($stateProvider,$urlRouterProvider){
	
	$stateProvider.state('home',{
		url:'/home',
		templateUrl: 'views/home.html',
		controller: 'HomeController'
	});
	$stateProvider.state('search',{
		url:'/search',
		templateUrl: 'views/search.html',
		controller: 'myCtrl'
	});
	$stateProvider.state('newProduct',{
		url:'/newProduct',
		templateUrl: 'views/NewProduct.html',
		controller: 'NewProductController'
	});
	
	
	
});

app.controller("HomeController",function(){

	
	
});
app.controller("NewProductController",function($scope,$http){
  $scope.product={designation:"",price:0.0,quantity:0};
  $scope.mode=0;
	$scope.saveProduct=function(){
		 $http({
		      method: 'POST',
		      url: 'http://localhost:9991/products'+$scope.product
		   }).then(function (response){
			  
			   console.log(response, 'res');
			   data = response.data;
			   $scope.product=data;
			   $scope.mode=1;
			   
		   },function (error){
	         console.log(error);
		   });
	  
		
	}
	
$scope.modeForm=function(){
	    $scope.product={designation:"",price:0.0,quantity:0};
		$scope.mode=0;
	}
	
	  
	
});


app.controller("myCtrl",function($scope,$http){
   $scope.pageProducts=null;
   $scope.search="";
   $scope.pageCurrent=0;
   $scope.size=4;
   $scope.pages=[];
   $scope.searchProducts=function()
   {
	   
	   $http({
		      method: 'GET',
		      url: 'http://localhost:9991/searchProducts?keyword='+$scope.search+"&page="+$scope.pageCurrent+"&size="+$scope.size
		   }).then(function (response){
			  
			   console.log(response, 'res');
			   data = response.data;
			   $scope.pageProducts=data;	
			   $scope.pages=new Array(data.totalPages);
			   
		   },function (error){
	          console.log(error);
		   });
	   
   }
   
   $scope.getProducts=function()
   {
	   $scope.pageCurrent=0;
	   $scope.searchProducts();
   }
   
   $scope.goToPage=function(p){
	   $scope.pageCurrent=p;
	   $scope.searchProducts();
   }
   
  
	
});


