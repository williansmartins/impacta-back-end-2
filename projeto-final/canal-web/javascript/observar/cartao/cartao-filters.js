angular.module('controlei')
.filter('myDateFormat', function myDateFormat($filter){
  return function(text){
    var  tempdate= new Date(text.replace(/-/g,"/")); 
    return $filter('date')(tempdate, "dd/MM/yyyy");
  }
});