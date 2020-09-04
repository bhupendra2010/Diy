$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/DIY/src/test/Resources/store.feature");
formatter.feature({
  "line": 1,
  "name": "Store finder",
  "description": "",
  "id": "store-finder",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11612815900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Store location",
  "description": "",
  "id": "store-finder;store-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User search for the store and enter his postcode",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should find his nearby store",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefProduct.user_is_on_Homepage()"
});
formatter.result({
  "duration": 2650629000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefStore.user_search_for_the_store_and_enter_his_postcode()"
});
formatter.result({
  "duration": 3130844700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefStore.user_should_find_his_nearby_store()"
});
formatter.result({
  "duration": 132200,
  "status": "passed"
});
});