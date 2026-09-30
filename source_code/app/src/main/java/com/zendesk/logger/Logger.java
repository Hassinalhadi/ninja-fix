package com.zendesk.logger;

import Q0.c;
import android.util.Log;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.clevertap.android.sdk.Constants;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class Logger {
    private static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static boolean loggable;
    private static LogAppender platformLogger;
    private static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone("UTC");
    private static final List<LogAppender> USER_DEFINED_APPENDER = new ArrayList();

    /* loaded from: classes2.dex */
    public static class Android implements LogAppender {
        private static final int MAX_LINE_LENGTH = 4000;

        private boolean appendUtcInLogs(String str) {
            if (StringUtils.hasLength(str)) {
                if (str.endsWith("Provider") || str.endsWith("Service")) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // com.zendesk.logger.Logger.LogAppender
        public void log(Priority priority, String str, String str2, Throwable th) {
            Priority priority2;
            String androidTag = LoggerHelper.getAndroidTag(str);
            if (appendUtcInLogs(str) && (priority2 = Priority.ERROR) == priority) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Logger.ISO_8601_FORMAT, Locale.US);
                simpleDateFormat.setTimeZone(Logger.UTC_TIMEZONE);
                Log.println(priority2.priority, androidTag, "Time in UTC: " + simpleDateFormat.format(new Date()));
            }
            if (th != null) {
                StringBuilder tango = c.tango(str2);
                tango.append(StringUtils.LINE_SEPARATOR);
                tango.append(Log.getStackTraceString(th));
                str2 = tango.toString();
            }
            Iterator<String> it = LoggerHelper.splitLogMessage(str2, MAX_LINE_LENGTH).iterator();
            while (it.hasNext()) {
                Log.println(priority == null ? Priority.INFO.priority : priority.priority, androidTag, it.next());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Java implements LogAppender {
        @Override // com.zendesk.logger.Logger.LogAppender
        public void log(Priority priority, String str, String str2, Throwable th) {
            char levelFromPriority;
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(Constants.AES_PREFIX);
            sb2.append(new SimpleDateFormat(Logger.ISO_8601_FORMAT, Locale.US).format(new Date()));
            sb2.append("] ");
            if (priority == null) {
                levelFromPriority = LoggerHelper.getLevelFromPriority(Priority.INFO.priority);
            } else {
                levelFromPriority = LoggerHelper.getLevelFromPriority(priority.priority);
            }
            sb2.append(levelFromPriority);
            sb2.append("/");
            if (!StringUtils.hasLength(str)) {
                str = "UNKNOWN";
            }
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            System.out.println(sb2.toString());
            if (th != null) {
                th.printStackTrace(System.out);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface LogAppender {
        void log(Priority priority, String str, String str2, Throwable th);
    }

    /* loaded from: classes2.dex */
    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Priority(int i4) {
            this.priority = i4;
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
            platformLogger = new Android();
        } catch (ClassNotFoundException unused) {
            if (platformLogger == null) {
                platformLogger = new Java();
            }
        } catch (Throwable th) {
            if (platformLogger == null) {
                platformLogger = new Java();
            }
            throw th;
        }
        loggable = false;
    }

    private Logger() {
    }

    public static void addLogAppender(LogAppender logAppender) {
        if (logAppender != null) {
            USER_DEFINED_APPENDER.add(logAppender);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        logInternal(Priority.DEBUG, str, str2, null, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        logInternal(Priority.ERROR, str, str2, null, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        logInternal(Priority.INFO, str, str2, null, objArr);
    }

    public static boolean isLoggable() {
        return loggable;
    }

    private static void logInternal(Priority priority, String str, String str2, Throwable th, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (loggable) {
            platformLogger.log(priority, str, str2, th);
            Iterator<LogAppender> it = USER_DEFINED_APPENDER.iterator();
            while (it.hasNext()) {
                it.next().log(priority, str, str2, th);
            }
        }
    }

    public static void removeAllLogAppender() {
        USER_DEFINED_APPENDER.clear();
    }

    public static void setLoggable(boolean z2) {
        loggable = z2;
    }

    public static void v(String str, String str2, Object... objArr) {
        logInternal(Priority.VERBOSE, str, str2, null, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        logInternal(Priority.WARN, str, str2, null, objArr);
    }

    public static void d(String str, String str2, Throwable th, Object... objArr) {
        logInternal(Priority.DEBUG, str, str2, th, objArr);
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        logInternal(Priority.ERROR, str, str2, th, objArr);
    }

    public static void i(String str, String str2, Throwable th, Object... objArr) {
        logInternal(Priority.INFO, str, str2, th, objArr);
    }

    public static void v(String str, String str2, Throwable th, Object... objArr) {
        logInternal(Priority.VERBOSE, str, str2, th, objArr);
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        logInternal(Priority.WARN, str, str2, th, objArr);
    }

    public static void e(String str, ErrorResponse errorResponse) {
        StringBuilder sb2 = new StringBuilder();
        if (errorResponse != null) {
            sb2.append("Network Error: ");
            sb2.append(errorResponse.isNetworkError());
            sb2.append(", Status Code: ");
            sb2.append(errorResponse.getStatus());
            if (StringUtils.hasLength(errorResponse.getReason())) {
                sb2.append(", Reason: ");
                sb2.append(errorResponse.getReason());
            }
        }
        String sb3 = sb2.toString();
        Priority priority = Priority.ERROR;
        if (!StringUtils.hasLength(sb3)) {
            sb3 = LogMessages.UNKNOWN_ERROR;
        }
        logInternal(priority, str, sb3, null, new Object[0]);
    }
}
