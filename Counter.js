// Approach: Using Closures in JavaScript/TypeScript
var createCounter = function (n) {
    return function () {
        return n++;
    };
};
