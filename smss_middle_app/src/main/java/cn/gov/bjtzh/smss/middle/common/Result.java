package cn.gov.bjtzh.smss.middle.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @create 2020-05-31 19:11
 * 定义统一返回结果
 */
@Data
public class Result {
    private Boolean success; //是否成功
    private Integer code;  //状态码
    private String message; //提示信息
    private Map<String, Object> data = new HashMap<String, Object>();  //数据
    //构造私有
    private Result(){}
    //成功
    public static Result ok(){
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }
    //失败
    public static Result error(){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }
    //链式编程
    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public Result message(String message){
        this.setMessage(message);
        return this;
    }
    public Result code(Integer code){
        this.setCode(code);
        return this;
    }
    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
