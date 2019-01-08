package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void testString(){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("111-----"+stringBuilder.toString());

        Boolean b = new Boolean(String.valueOf(1L));
        System.out.println("222-----"+b);


        Boolean b1 = new Boolean(String.valueOf(0L));
        System.out.println("333-----"+b1);


        System.out.println("".equals("123"));
        ResStudentInfoDTO resStudentInfoDTO = new ResStudentInfoDTO();
        System.out.println(resStudentInfoDTO.getWeChat());

        System.out.println(resStudentInfoDTO.getWeChat().equals("123"));
    }


    @Test
    public void testString1(){
        System.out.println(((String)null).contains("123"));
    }


    @Test
    public void testJson(){
        String str = "{\n" +
                "  \"flag\": 1,\n" +
                "  \"message\": \"SUCCESS\",\n" +
                "  \"data\": []\n" +
                "}";

        JSONObject res = JSONObject.parseObject(str);
        JSONArray dataList = res.getJSONArray("data");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataList",dataList);
        System.out.println(jsonObject.toJSONString());
    }
}
