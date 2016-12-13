(function() {
    'use strict';

    angular
        .module('jhipstertestApp')
        .controller('CommentController', CommentController);

    CommentController.$inject = ['$scope', '$state', 'DataUtils', 'Comment'];

    function CommentController ($scope, $state, DataUtils, Comment) {
        var vm = this;

        vm.comments = [];
        vm.openFile = DataUtils.openFile;
        vm.byteSize = DataUtils.byteSize;

        loadAll();

        function loadAll() {
            Comment.query(function(result) {
                vm.comments = result;
                vm.searchQuery = null;
            });
        }
    }
})();
