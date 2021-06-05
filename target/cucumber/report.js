$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SolutionServices.feature");
formatter.feature({
  "line": 1,
  "name": "Solution Menu",
  "description": "",
  "id": "solution-menu",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate the solutions menu",
  "description": "",
  "id": "solution-menu;validate-the-solutions-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user search for \"\u003cOrangeWebsite\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on FirstLink",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "go to Orange website link has below \"\u003cUrl\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user can click on solution menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select All Products",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "validate the solutions dropdown list contains the following values",
  "rows": [
    {
      "cells": [
        "Business innovation"
      ],
      "line": 11
    },
    {
      "cells": [
        "Cloud"
      ],
      "line": 12
    },
    {
      "cells": [
        "Collaborative workspace"
      ],
      "line": 13
    },
    {
      "cells": [
        "Customer experience"
      ],
      "line": 14
    },
    {
      "cells": [
        "Cyberdefense"
      ],
      "line": 15
    },
    {
      "cells": [
        "Data intelligence"
      ],
      "line": 16
    },
    {
      "cells": [
        "Internet of Things"
      ],
      "line": 17
    },
    {
      "cells": [
        "Mobile connectivity"
      ],
      "line": 18
    },
    {
      "cells": [
        "Network transformation"
      ],
      "line": 19
    },
    {
      "cells": [
        "Services"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user select Cloud and click apply",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user choose item with the following title",
  "rows": [
    {
      "cells": [
        "Managed Applications: improve operational capability in the cloud"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Validate that the system opens the right article",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "solution-menu;validate-the-solutions-menu;",
  "rows": [
    {
      "cells": [
        "OrangeWebsite",
        "Url"
      ],
      "line": 27,
      "id": "solution-menu;validate-the-solutions-menu;;1"
    },
    {
      "cells": [
        "Orange Business Services",
        "https://www.orange-business.com/en"
      ],
      "line": 28,
      "id": "solution-menu;validate-the-solutions-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6250518600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate the solutions menu",
  "description": "",
  "id": "solution-menu;validate-the-solutions-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user search for \"Orange Business Services\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on FirstLink",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "go to Orange website link has below \"https://www.orange-business.com/en\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user can click on solution menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select All Products",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "validate the solutions dropdown list contains the following values",
  "rows": [
    {
      "cells": [
        "Business innovation"
      ],
      "line": 11
    },
    {
      "cells": [
        "Cloud"
      ],
      "line": 12
    },
    {
      "cells": [
        "Collaborative workspace"
      ],
      "line": 13
    },
    {
      "cells": [
        "Customer experience"
      ],
      "line": 14
    },
    {
      "cells": [
        "Cyberdefense"
      ],
      "line": 15
    },
    {
      "cells": [
        "Data intelligence"
      ],
      "line": 16
    },
    {
      "cells": [
        "Internet of Things"
      ],
      "line": 17
    },
    {
      "cells": [
        "Mobile connectivity"
      ],
      "line": 18
    },
    {
      "cells": [
        "Network transformation"
      ],
      "line": 19
    },
    {
      "cells": [
        "Services"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user select Cloud and click apply",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user choose item with the following title",
  "rows": [
    {
      "cells": [
        "Managed Applications: improve operational capability in the cloud"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Validate that the system opens the right article",
  "keyword": "Then "
});
formatter.match({
  "location": "SolutionsMenuSteps.user_navigates_to_Google()"
});
formatter.result({
  "duration": 2008226500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orange Business Services",
      "offset": 17
    }
  ],
  "location": "SolutionsMenuSteps.user_search_for(String)"
});
formatter.result({
  "duration": 2565153300,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.user_clicks_on_FirstLink()"
});
formatter.result({
  "duration": 8843817300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.orange-business.com/en",
      "offset": 37
    }
  ],
  "location": "SolutionsMenuSteps.go_to_Orange_website_link_has_below(String)"
});
formatter.result({
  "duration": 47638100,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.user_can_click_on_solution_menu()"
});
formatter.result({
  "duration": 578441600,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.user_select_All_Products()"
});
formatter.result({
  "duration": 3268772700,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.validate_the_solutions_dropdown_list_contains_the_following_values(DataTable)"
});
formatter.result({
  "duration": 821000000,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.user_select_Cloud_and_click_apply()"
});
formatter.result({
  "duration": 3490582200,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.user_choose_item_with_the_following_title(DataTable)"
});
formatter.result({
  "duration": 4246411400,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsMenuSteps.validate_that_the_system_opens_the_right_article()"
});
formatter.result({
  "duration": 50486900,
  "status": "passed"
});
});