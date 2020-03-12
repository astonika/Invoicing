package com.xu.web;

public class ReturnPurchaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<ReturnItem> itemList;
    private List<ReturnOrder> returnList;
    private Long counts;
    private Long currPage;
    private Long tatPage;
    @Resource
    private ReturnPurchaseService returnPurchaseService;
    @Resource
    private ManagerService managerService;

}
