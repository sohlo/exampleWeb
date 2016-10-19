angular.module('app', [])
    .controller('controller',
        function ($scope, $http) {
            $scope.data = {};
            $scope.data.num1 = "";
            $scope.data.num2 = "";
            $scope.data.op = "";

            $scope.calc = function () {
                console.log($scope.data);
                $http.post('http://localhost:8080/calculate', $scope.data).then(function (response) {
                    $scope.result = response.data;
                })
            }
        });