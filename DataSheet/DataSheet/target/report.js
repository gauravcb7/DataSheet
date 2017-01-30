$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/01Basic_Deal_Creation.feature");
formatter.feature({
  "line": 1,
  "name": "Basic Deal Creation with all mandatory fields",
  "description": "This Feature cover basic deal creation having all mandatory fields and perform basic field validation\r\nAll scenarios are data driver from excel. Browser and URL are also from data table. SPOC variable parameter in user story",
  "id": "basic-deal-creation-with-all-mandatory-fields",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 56,
  "name": "Basic deal creation without rebadge tab and all mandatory fields and validation",
  "description": "",
  "id": "basic-deal-creation-with-all-mandatory-fields;basic-deal-creation-without-rebadge-tab-and-all-mandatory-fields-and-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 55,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "Workbook \"\u003cWorkbook\u003e\" Sheet \"\u003cSheetKIF\u003e\" and DataSet \"\u003cDatasetKIF\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "Browser name and navigate to Url",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "Click New Deal button",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Navigates to KIF page",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Enter KIF page fields as per DataSet \"\u003cDatasetKIF\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Click save button",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Deal Number Successfully Created",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Click the SPOC button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Enter SPOC details \"\u003cSPOC\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Click save button on SPOC selection page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "verify SPOC Allocation section populated",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "click Next button on KIF page",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "Navigates to SI page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Workbook \"\u003cWorkbook\u003e\" Sheet \"\u003cSheetSI\u003e\" and DataSet \"\u003cDatasetSI\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "Enter basic SI page fields",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Enter KT fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Enter Additiona Expense fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Enter Effort Overrun Contingencies fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Click save and move to Role Creation button",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "Navigates to Role Creation page",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Add Customer Role as per Datset \"\u003cDatasetRC1\u003e\" from Workbook \"\u003cWorkbook\u003e\" and Sheet \"\u003cSheetRC\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Add Customer Role as per Datset \"\u003cDatasetRC2\u003e\" from Workbook \"\u003cWorkbook\u003e\" and Sheet \"\u003cSheetRC\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Add Customer Role as per Datset \"\u003cDatasetRC3\u003e\" from Workbook \"\u003cWorkbook\u003e\" and Sheet \"\u003cSheetRC\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Click Rampup button",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "Navigates to Ramp Up page",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "Insert number of rows for multiple ramp up as per Datset \"\u003cDatasetRU\u003e\" from Workbook \"\u003cWorkbook\u003e\" and Sheet \"\u003cSheetRU\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "Enter details of ramp up in Insert Ramp Up window from Workbook \"\u003cWorkbook\u003e\" and Sheet \"\u003cSheetRUINSERT\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Click Insert on Ramp Up window",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Ramp up rows get saved and reflected on UI",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "Click Next button on Ramp Up page",
  "keyword": "When "
});
formatter.step({
  "line": 88,
  "name": "Navigates to Rate Card page",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Validate Rate Card Table Data For Given Workbook \"\u003cWorkbookDeal\u003e\" and Sheet \"\u003cSheetRateCard\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Click Next button on Rate Card page",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Navigates to PnL page",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Validate PnL Table Data For Given Workbook \"\u003cWorkbookDeal\u003e\" and Sheet \"\u003cSheetPnL\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 93,
  "name": "",
  "description": "",
  "id": "basic-deal-creation-with-all-mandatory-fields;basic-deal-creation-without-rebadge-tab-and-all-mandatory-fields-and-validation;",
  "rows": [
    {
      "cells": [
        "Workbook",
        "SheetKIF",
        "DatasetKIF",
        "SPOC",
        "SheetSI",
        "DatasetSI",
        "SheetRC",
        "DatasetRC1",
        "DatasetRC2",
        "DatasetRC3",
        "SheetRU",
        "DatasetRU",
        "SheetRUINSERT",
        "WorkbookDeal",
        "SheetRateCard",
        "SheetPnL"
      ],
      "line": 94,
      "id": "basic-deal-creation-with-all-mandatory-fields;basic-deal-creation-without-rebadge-tab-and-all-mandatory-fields-and-validation;;1"
    },
    {
      "cells": [
        "TEST_DATA",
        "KIF",
        "DS2",
        "srivastavag",
        "SI",
        "DS2",
        "RC",
        "DS4",
        "DS5",
        "DS6",
        "RU",
        "DS2",
        "RUINSERT",
        "TEST_DEAL_01",
        "RateCardData",
        "PnLData"
      ],
      "line": 95,
      "id": "basic-deal-creation-with-all-mandatory-fields;basic-deal-creation-without-rebadge-tab-and-all-mandatory-fields-and-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 95,
  "name": "Basic deal creation without rebadge tab and all mandatory fields and validation",
  "description": "",
  "id": "basic-deal-creation-with-all-mandatory-fields;basic-deal-creation-without-rebadge-tab-and-all-mandatory-fields-and-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 55,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "Workbook \"TEST_DATA\" Sheet \"KIF\" and DataSet \"DS2\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "Browser name and navigate to Url",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "Click New Deal button",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Navigates to KIF page",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Enter KIF page fields as per DataSet \"DS2\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Click save button",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Deal Number Successfully Created",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Click the SPOC button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Enter SPOC details \"srivastavag\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Click save button on SPOC selection page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "verify SPOC Allocation section populated",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "click Next button on KIF page",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "Navigates to SI page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Workbook \"TEST_DATA\" Sheet \"SI\" and DataSet \"DS2\"",
  "matchedColumns": [
    0,
    4,
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "Enter basic SI page fields",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Enter KT fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Enter Additiona Expense fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Enter Effort Overrun Contingencies fields in SI page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Click save and move to Role Creation button",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "Navigates to Role Creation page",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Add Customer Role as per Datset \"DS4\" from Workbook \"TEST_DATA\" and Sheet \"RC\"",
  "matchedColumns": [
    0,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Add Customer Role as per Datset \"DS5\" from Workbook \"TEST_DATA\" and Sheet \"RC\"",
  "matchedColumns": [
    0,
    6,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Add Customer Role as per Datset \"DS6\" from Workbook \"TEST_DATA\" and Sheet \"RC\"",
  "matchedColumns": [
    0,
    6,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Click Rampup button",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "Navigates to Ramp Up page",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "Insert number of rows for multiple ramp up as per Datset \"DS2\" from Workbook \"TEST_DATA\" and Sheet \"RU\"",
  "matchedColumns": [
    0,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "Enter details of ramp up in Insert Ramp Up window from Workbook \"TEST_DATA\" and Sheet \"RUINSERT\"",
  "matchedColumns": [
    0,
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Click Insert on Ramp Up window",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Ramp up rows get saved and reflected on UI",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "Click Next button on Ramp Up page",
  "keyword": "When "
});
formatter.step({
  "line": 88,
  "name": "Navigates to Rate Card page",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Validate Rate Card Table Data For Given Workbook \"TEST_DEAL_01\" and Sheet \"RateCardData\"",
  "matchedColumns": [
    13,
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Click Next button on Rate Card page",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Navigates to PnL page",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Validate PnL Table Data For Given Workbook \"TEST_DEAL_01\" and Sheet \"PnLData\"",
  "matchedColumns": [
    13,
    15
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});