angular.module('myApp', []).controller('userCtrl', function($scope) {
$scope.username = '';
$scope.email = '';
$scope.passw1 = '';
$scope.passw2 = '';

$scope.error = false;
$scope.incomplete = false;
$scope.$watch('passw1',function() {$scope.test();});
$scope.$watch('passw2',function() {$scope.test();});
$scope.test = function() {
  if ($scope.passw1 !== $scope.passw2) {
    $scope.error = true;
    } else {
    $scope.error = false;
  }

};

$scope.int=function(name){
$scope.aa=name;
}


});