package cn.gov.bjtzh.smss.middle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
  /*  *//**
     * 测试
     * @param map
     * @return
     *//*
    @RequestMapping(value = "/queryBatchsByBatchNo", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse<Map<String, Object>> queryByBatchNo(String json) {
        Map<String, Object> resMap = new ConcurrentHashMap<String, Object>();
        // 总数
        List<FlowBusinessBatch> batchs = flowBusinessBatchMapper.selectBatchsByBatchNo(batchNo);
        if (batchs == null || batchs.size() == 0) {
            return new ApiResponse<>(Status.EMPTY_DATA.getCode(), Status.EMPTY_DATA.getMessage(), null);
        }
        resMap.put("batchs", batchs);
        return new ApiResponse<>(Status.SUCCESS.getCode(), Status.SUCCESS.getMessage(), resMap);
    }*/
}
