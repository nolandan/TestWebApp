(function() {
    var someData = {
        name: "the name",
        price: "the price"
    };

    var app = angular.module('danielTest', [ ]);
    app.controller("MyTest", function() {
      this.testObject = someData;
    });

} ());
