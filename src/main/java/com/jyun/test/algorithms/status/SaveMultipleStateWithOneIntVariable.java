package com.jyun.test.algorithms.status;

/**
 *
 * 如今，各种大小网站经常搞各种推广优惠活动，吸引新用户，回馈老用户。如何方便快捷地记录和查询用户参与某项活动的数据是开发人员必须面对的问题。

 方法一：记录用户参与活动数据到记录详情表中，查询该表一定可以获得用户的参与状态。

 方法一缺点：需要单独执行一次查询操作，如果参与记录表数据量大，查询效率又是个问题。



 方法二：在用户基本信息表中添加状态位字段，用户参与活动成功后，更新状态位字段，查询参与状态时直接读取基本信息中的相应字段。

 方法二缺点：活动数量增加时，状态位字段必须相应增加，表中字段过多不是什么好现象。



 方法三：使用一个整数字段保存多个状态位，在JAVA开发中，最多可保存32个状态位，完全可以满足一般中小网站的需求。

 实现方法：JAVA语言中，一个整数有32个二进制位，每位可保存一个活动状态，通过 & 运算和 | 运算符，可对预先定义的状态位进行修改和判断。示例代码如下：
 *
 *
 *
 *
 *
 * 用二进制位来表示状态， state的二进制表示下，从右边数起，依次是第0位，第1位，第2位。
 * 第0位 表示扫微信二维码关注公众号活动
 * 第1位 表示分享链接到QQ群活动
 * 第2位 表示分享链接到论坛活动
 * 第3位 表示分享链接到微信朋友圈活动
 * 第4位 表示充50送2元红包活动
 * 第5位 表示充100送5元红包活动
 */
public class SaveMultipleStateWithOneIntVariable {
	/**
     * 更新公众号关注状态为已关注
     * @param state
     * @return
     */
    public static int addSubscribleWechat(int state) {
        return state | 0x1;
    }
 
 
    /**
     * 判断是否已关注公众号
     * @param state
     * @return
     */
    public static boolean isSubscribleWechat(int state) {
        return (state & 0x1) > 0;
    }
 
 
    public static int addShareQQ(int state) {
        return state | 0x2;
    }
 
 
    public static boolean isShareQQ(int state) {
        return (state & 0x2) > 0;
    }
 
 
    public static int addShareBBS(int state) {
        return state | 0x4;
    }
 
 
    public static boolean isShareBBS(int state) {
        return (state & 0x4) > 0;
    }
 
 
    public static int addShareWechat(int state) {
        return state | 0x8;
    }
 
 
    public static boolean isShareWechat(int state) {
        return (state & 0x8) > 0;
    }
 
 
    public static int addRecharge50(int state) {
        return state | 0x10;
    }
 
 
    public static boolean isRecharge50(int state) {
        return (state & 0x10) > 0;
    }
 
 
    public static int addRecharge100(int state) {
        return state | 0x20;
    }
 
 
    public static boolean isRecharge100(int state) {
        return (state & 0x20) > 0;
    }
}