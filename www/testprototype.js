module.exports = {
    test: function (str, successCallback, errorCallback) {
        //TODO: When modifying the plugin, remove this silly alert,
        //      as the application javascript level is supposed to do something with
        //      the returned successCallback data.
        alert(str);
        cordova.exec(successCallback, errorCallback, "TestPrototype", "test", [str]);
    }
};
