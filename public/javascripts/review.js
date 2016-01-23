angular.module('myApp', []).controller('myCtrl', function($scope) {
$scope.error=true;
$scope.max=true;
$scope.$watch('review',function() {$scope.test();});
$scope.test = function() {
$scope.error=true;
$scope.max=true;
if(!$scope.review.incomplete){
    $scope.error = false;
}
if(!$scope.myForm.review.$error.maxlength ){
          $scope.max = false;
}

};

});