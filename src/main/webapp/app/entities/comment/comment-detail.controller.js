(function() {
    'use strict';

    angular
        .module('jhipstertestApp')
        .controller('CommentDetailController', CommentDetailController);

    CommentDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'DataUtils', 'entity', 'Comment', 'User', 'Question'];

    function CommentDetailController($scope, $rootScope, $stateParams, previousState, DataUtils, entity, Comment, User, Question) {
        var vm = this;

        vm.comment = entity;
        vm.previousState = previousState.name;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;

        var unsubscribe = $rootScope.$on('jhipstertestApp:commentUpdate', function(event, result) {
            vm.comment = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
