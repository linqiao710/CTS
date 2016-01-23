angular.module('myApp', []).controller('myCtrl', function($scope) {
$scope.incomplete = true;
 $scope.error=true;
$scope.$watch('toolname',function() {$scope.test();});

$scope.$watch('subcategories',function() {$scope.test();});
$scope.$watch('subcategory',function() {$scope.test();});
$scope.$watch('specification',function() {$scope.test();});
$scope.$watch('description',function() {$scope.test();});
$scope.$watch('isAvailable',function() {$scope.test();});
$scope.test = function() {
   $scope.incomplete = true;
   $scope.error=true;
     if (!$scope.toolname.incomplete && !$scope.subcategories.incomplete &&
     !$scope.subcategory.incomplete && !$scope.isAvailable.incomplete) {
                $scope.incomplete = false;
     }

      if(!$scope.toolForm.specification.$error.maxlength && !$scope.toolForm.description.$error.maxlength ){
                    $scope.error = false;
      }

};

 $scope.categories =
                   { 'Air Tools':[
                        'Sanders & Polishers',
                        'Grease Guns',
                        'Air Impact Wrenches'
                    ],

                    'Hand Tools': [
                        'Plumbing Tools',
                        'Hammers',
                        'Fastening Tools',
                          'Pliers',
                            'Screwdrivers',
                              'Wrenches',
                              'Cutting Tools'
                    ],
                     'Power Tools': [
                        'Grinders',
                        'Woodworking',
                         'Oscillating Tools',
                          'Sanders',
                           'Saws',
                            'Drills'
                     ]}

$scope.pass=function(is, cn,scn){
$scope.aa=is;
$scope.bb=cn;
$scope.cc=scn;



};
});