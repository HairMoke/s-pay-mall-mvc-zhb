package com.hb.domain.po;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信模板消息
 */
public class WeixinTemplateMessageVO {


    private String touser = "ojK1R7Ka2ruj8LK4HKU5hBGeEsuc";
    private String template_id = "9djrX1iJ6lrBUATIAN1NKgsIy7Y8-rRaLbZN5P2zLbw";
    private String url = "https://weixin.qq.com";
    private Map<String, Map<String, String>> data = new HashMap<>();

    public WeixinTemplateMessageVO(String touser, String template_id) {
        this.touser = touser;
        this.template_id = template_id;
    }

    public void put(TemplateKey key, String value) {
        data.put(key.getCode(), new HashMap<String, String>() {
            private static final long serialVersionUID = 7092338402387318563L;

            {
                put("value", value);
            }
        });
    }

    public static void put(Map<String, Map<String, String>> data, TemplateKey key, String value) {
        data.put(key.getCode(), new HashMap<String, String>() {
            private static final long serialVersionUID = 7092338402387318563L;
            {
                put("value", value);
            }
        });
    }


    public enum TemplateKey {
        USER("user","用户ID")
        ;

        private String code;
        private String desc;

        TemplateKey(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }


    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, String>> data) {
        this.data = data;
    }
}
