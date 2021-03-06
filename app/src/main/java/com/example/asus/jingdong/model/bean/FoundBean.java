package com.example.asus.jingdong.model.bean;

import java.util.List;

/**
 * 类描述  发现页面Bean
 */
public class FoundBean {



    private int code;
    private boolean success;
    private int height;
    private int width;
    private Object message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userAge : 25
         * introduction : 91年/处女座/性格直白，爱好广泛，有点女汉子/喜欢性格开朗，三观契合，高冷文艺范，有肌肉，175+/公司职业
         * replyTimes : 12
         * url : http://www.yulin520.com/a2a/h5/impress/i1/319?a=1507893550869
         * createTime : 1465380170000
         * hxKey : dac884f7cc81691ba28a004091cbe122
         * img : http://img1.yulin520.com/news/BPKZUX0MNFR0OT0WLCOD.png#598_450
         * yulin : 80821
         * star : 77
         * title : 刘佳怡 ：直白女汉子也有个文艺梦
         * occupation : 保险
         * userImg : http://img1.yulin520.com/news/BPKZUX0MNFR0OT0WLCOD.png#598_450
         * impressEditId : 319
         * impressType : 0
         * topTime : 1469503022000
         * recommend : 0
         * remark :
         * click : 0
         * userName : 嘉咦咦咦
         * source : 0
         * reporter : 0
         * status : 1
         * content :
         */

        private int userAge;
        private String introduction;
        private int replyTimes;
        private String url;
        private long createTime;
        private String hxKey;
        private String img;
        private String yulin;
        private int star;
        private String title;
        private String occupation;
        private String userImg;
        private int impressEditId;
        private int impressType;
        private long topTime;
        private int recommend;
        private String remark;
        private int click;
        private String userName;
        private int source;
        private int reporter;
        private int status;
        private String content;

        public int getUserAge() {
            return userAge;
        }

        public void setUserAge(int userAge) {
            this.userAge = userAge;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public int getReplyTimes() {
            return replyTimes;
        }

        public void setReplyTimes(int replyTimes) {
            this.replyTimes = replyTimes;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getHxKey() {
            return hxKey;
        }

        public void setHxKey(String hxKey) {
            this.hxKey = hxKey;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getYulin() {
            return yulin;
        }

        public void setYulin(String yulin) {
            this.yulin = yulin;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getUserImg() {
            return userImg;
        }

        public void setUserImg(String userImg) {
            this.userImg = userImg;
        }

        public int getImpressEditId() {
            return impressEditId;
        }

        public void setImpressEditId(int impressEditId) {
            this.impressEditId = impressEditId;
        }

        public int getImpressType() {
            return impressType;
        }

        public void setImpressType(int impressType) {
            this.impressType = impressType;
        }

        public long getTopTime() {
            return topTime;
        }

        public void setTopTime(long topTime) {
            this.topTime = topTime;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getClick() {
            return click;
        }

        public void setClick(int click) {
            this.click = click;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getReporter() {
            return reporter;
        }

        public void setReporter(int reporter) {
            this.reporter = reporter;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
