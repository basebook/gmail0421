package gmail.common.utils;

public class Constant {

    public static final int SUPER_ADMIN=1;

    public static final String PAGE="page";

    public static final String LIMIT="limit";

    public static final String ORDER_FIELD="sidx";

    public static final String ORDER="order";

    public static final String ASC="asc";

    public enum MenuType
    {
        CATALOG(0),
        MENU(1),
        BUTTON(2);
        private int value;
        MenuType(int value) {this.value=value;}
        public int getValue() {
            return value;
        }

    }

    public enum ScheduleStatus{

        NORMAL(0),
        PAUSE(1);

        private int value;
        ScheduleStatus(int value) {this.value=value;}
        public int getValue(){return value;}
    }

    /**
     * 云服务商
     */
    public enum CloudService {
        /**
         * 七牛云
         */
        QINIU(1),
        /**
         * 阿里云
         */
        ALIYUN(2),
        /**
         * 腾讯云
         */
        QCLOUD(3);

        private int value;

        CloudService(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
