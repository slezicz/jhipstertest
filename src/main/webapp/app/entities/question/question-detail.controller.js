(function() {
    'use strict';

    angular
        .module('jhipstertestApp')
        .controller('QuestionDetailController', QuestionDetailController);

    QuestionDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'DataUtils', 'entity', 'Question', 'User'];

    function QuestionDetailController($scope, $rootScope, $stateParams, previousState, DataUtils, entity, Question, User) {
        var vm = this;

        vm.question = entity;
        vm.previousState = previousState.name;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;

        var unsubscribe = $rootScope.$on('jhipstertestApp:questionUpdate', function(event, result) {
            vm.question = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
