package pub.xplus.fp.file.model;


/**
 * Created by AllenYe on 2016/9/19.
 */
public class V0400F01 implements FileHeader {
    public final static String VERSION = "0400";
    /**
     * 逻辑记录长度
     */
    private int len;

    @ItemDesc(name = "文件长度", size = 12)
    private String c101;

    @ItemDesc(name = "逻辑记录类型", size = 2)
    private int c102;

    @ItemDesc(name = "十指指纹信息记录数量", size = 6)
    private int c103;

    @ItemDesc(name = "现场指纹信息记录数量", size = 6)
    private int c104;

    @ItemDesc(name = "指纹正查及倒查比中信息记录数量", size = 6)
    private int c105;

    @ItemDesc(name = "指纹查重比中信息记录数量", size = 6)
    private int c106;

    @ItemDesc(name = "指纹串查比中信息记录数量", size = 6)
    private int c107;

    @ItemDesc(name = "现场指纹查询请求信息记录数量", size = 6)
    private int c108;

    @ItemDesc(name = "十指指纹查询请求信息记录数量", size = 6)
    private int c109;

    @ItemDesc(name = "正查比对结果候选信息记录数量", size = 6)
    private int c110;

    @ItemDesc(name = "倒查比对结果候选信息记录数量", size = 6)
    private int c111;

    @ItemDesc(name = "查重比对结果候选信息记录数量", size = 6)
    private int c112;

    @ItemDesc(name = "串查比对结果候选信息记录数量", size = 6)
    private int c113;

    @ItemDesc(name = "自定义逻辑记录数量", size = 6)
    private int c114;

    @ItemDesc(name = "发送时间", size = 14)
    private String c115;

    @ItemDesc(name = "接收单位代码", size = 12)
    private String c116;

    @ItemDesc(name = "发送单位代码", size = 12)
    private String c117;

    @ItemDesc(name = "发送单位名称", size = 70)
    private String c118;

    @ItemDesc(name = "发送人", size = 30)
    private String c119;

    @ItemDesc(name = "发送单位系统类型", size = 4)
    private String c120;

    @ItemDesc(name = "任务控制号", size = 10)
    private String c121;

    @ItemDesc(name = "备注", size = 512)
    private String c122;

    /**
     * 记录结束符
     */
    @ItemDesc(name = "记录结束符", size = 1, type = ItemType.BYTE)
    private byte[] c123;


    public String getVersion() {
        return VERSION;
    }

    public int getLength() {
        return this.len;
    }

    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
    }

    public int getC102() {
        return c102;
    }

    public void setC102(int c102) {
        this.c102 = c102;
    }

    public int getC103() {
        return c103;
    }

    public void setC103(int c103) {
        this.c103 = c103;
    }

    public int getC104() {
        return c104;
    }

    public void setC104(int c104) {
        this.c104 = c104;
    }

    public int getC105() {
        return c105;
    }

    public void setC105(int c105) {
        this.c105 = c105;
    }

    public int getC106() {
        return c106;
    }

    public void setC106(int c106) {
        this.c106 = c106;
    }

    public int getC107() {
        return c107;
    }

    public void setC107(int c107) {
        this.c107 = c107;
    }

    public int getC108() {
        return c108;
    }

    public void setC108(int c108) {
        this.c108 = c108;
    }

    public int getC109() {
        return c109;
    }

    public void setC109(int c109) {
        this.c109 = c109;
    }

    public int getC110() {
        return c110;
    }

    public void setC110(int c110) {
        this.c110 = c110;
    }

    public int getC111() {
        return c111;
    }

    public void setC111(int c111) {
        this.c111 = c111;
    }

    public int getC112() {
        return c112;
    }

    public void setC112(int c112) {
        this.c112 = c112;
    }

    public int getC113() {
        return c113;
    }

    public void setC113(int c113) {
        this.c113 = c113;
    }

    public int getC114() {
        return c114;
    }

    public void setC114(int c114) {
        this.c114 = c114;
    }

    public String getC115() {
        return c115;
    }

    public void setC115(String c115) {
        this.c115 = c115;
    }

    public String getC116() {
        return c116;
    }

    public void setC116(String c116) {
        this.c116 = c116;
    }

    public String getC117() {
        return c117;
    }

    public void setC117(String c117) {
        this.c117 = c117;
    }

    public String getC118() {
        return c118;
    }

    public void setC118(String c118) {
        this.c118 = c118;
    }

    public String getC119() {
        return c119;
    }

    public void setC119(String c119) {
        this.c119 = c119;
    }

    public String getC120() {
        return c120;
    }

    public void setC120(String c120) {
        this.c120 = c120;
    }

    public String getC121() {
        return c121;
    }

    public void setC121(String c121) {
        this.c121 = c121;
    }

    public String getC122() {
        return c122;
    }

    public void setC122(String c122) {
        this.c122 = c122;
    }

    public byte[] getC123() {
        return c123;
    }

    public void setC123(byte[] c123) {
        this.c123 = c123;
    }
}
