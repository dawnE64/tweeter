//package edu.byu.cs.tweeter.client.backgroundTask;
//
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.util.Log;
//
//import edu.byu.cs.tweeter.model.domain.AuthToken;
//import edu.byu.cs.tweeter.model.domain.User;
//
///**
// * Background task that queries how many other users a specified user is following.
// */
//public class GetFollowingCountTask extends GetCountTask {
//    private static final String LOG_TAG = "GetFollowingCountTask";
//
//    public GetFollowingCountTask(Handler messageHandler, AuthToken authToken, User targetUser) {
//        super(messageHandler, authToken, targetUser);
//    }
//
//    @Override
//    protected boolean runTask() {
//        this.count = 20; // fix with server
//        return true;
//    }
//
//    //    public static final String SUCCESS_KEY = "success";
////    public static final String COUNT_KEY = "count";
////    public static final String MESSAGE_KEY = "message";
////    public static final String EXCEPTION_KEY = "exception";
////
////    /**
////     * Auth token for logged-in user.
////     */
////    private AuthToken authToken;
////    /**
////     * The user whose following count is being retrieved.
////     * (This can be any user, not just the currently logged-in user.)
////     */
////    private User targetUser;
////    /**
////     * Message handler that will receive task results.
////     */
////    private Handler messageHandler;
////
////    public GetFollowingCountTask(AuthToken authToken, User targetUser, Handler messageHandler) {
////        this.authToken = authToken;
////        this.targetUser = targetUser;
////        this.messageHandler = messageHandler;
////    }
////
////    @Override
////    public void run() {
////        try {
////
////            sendSuccessMessage(20);
////
////        } catch (Exception ex) {
////            Log.e(LOG_TAG, ex.getMessage(), ex);
////            sendExceptionMessage(ex);
////        }
////    }
////
////    private void sendSuccessMessage(int count) {
////        Bundle msgBundle = new Bundle();
////        msgBundle.putBoolean(SUCCESS_KEY, true);
////        msgBundle.putInt(COUNT_KEY, count);
////
////        Message msg = Message.obtain();
////        msg.setData(msgBundle);
////
////        messageHandler.sendMessage(msg);
////    }
////
////    private void sendFailedMessage(String message) {
////        Bundle msgBundle = new Bundle();
////        msgBundle.putBoolean(SUCCESS_KEY, false);
////        msgBundle.putString(MESSAGE_KEY, message);
////
////        Message msg = Message.obtain();
////        msg.setData(msgBundle);
////
////        messageHandler.sendMessage(msg);
////    }
////
////    private void sendExceptionMessage(Exception exception) {
////        Bundle msgBundle = new Bundle();
////        msgBundle.putBoolean(SUCCESS_KEY, false);
////        msgBundle.putSerializable(EXCEPTION_KEY, exception);
////
////        Message msg = Message.obtain();
////        msg.setData(msgBundle);
////
////        messageHandler.sendMessage(msg);
////    }
//}
