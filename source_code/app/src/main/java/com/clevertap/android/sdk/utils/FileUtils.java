package com.clevertap.android.sdk.utils;

import Q0.c;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FileUtils {
    private final CleverTapInstanceConfig config;
    private final Context context;

    public FileUtils(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
    }

    public void deleteDirectory(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                synchronized (FileUtils.class) {
                    try {
                        File file = new File(this.context.getFilesDir(), str);
                        if (file.exists() && file.isDirectory()) {
                            for (String str2 : file.list()) {
                                this.config.getLogger().verbose(this.config.getAccountId(), "File" + str2 + " isDeleted:" + new File(file, str2).delete());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = this.config.getLogger();
                String accountId = this.config.getAccountId();
                StringBuilder victor = c.victor("writeFileOnInternalStorage: failed", str, " Error:");
                victor.append(e.getLocalizedMessage());
                logger.verbose(accountId, victor.toString());
            }
        }
    }

    public void deleteFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                synchronized (FileUtils.class) {
                    try {
                        File file = new File(this.context.getFilesDir(), str);
                        if (file.exists()) {
                            if (file.delete()) {
                                this.config.getLogger().verbose(this.config.getAccountId(), "File Deleted:" + str);
                            } else {
                                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to delete file" + str);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = this.config.getLogger();
                String accountId = this.config.getAccountId();
                StringBuilder victor = c.victor("writeFileOnInternalStorage: failed", str, " Error:");
                victor.append(e.getLocalizedMessage());
                logger.verbose(accountId, victor.toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readFromFile(String str) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        ?? r82;
        BufferedReader bufferedReader2;
        Exception e;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        StringBuilder sb2;
        try {
            try {
                fileInputStream2 = new FileInputStream(new File(this.context.getFilesDir() + "/" + str));
                try {
                    sb2 = new StringBuilder();
                    inputStreamReader = new InputStreamReader(fileInputStream2);
                } catch (Exception e4) {
                    e = e4;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r82 = str;
            }
            try {
                bufferedReader2 = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            fileInputStream2.close();
                            String sb3 = sb2.toString();
                            fileInputStream2.close();
                            inputStreamReader.close();
                            bufferedReader2.close();
                            return sb3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileInputStream = fileInputStream2;
                        this.config.getLogger().verbose(this.config.getAccountId(), "[Exception While Reading: " + e.getLocalizedMessage());
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader2 == null) {
                            bufferedReader2.close();
                            return "";
                        }
                        return "";
                    }
                }
            } catch (Exception e10) {
                e = e10;
                bufferedReader2 = null;
                e = e;
                fileInputStream = fileInputStream2;
                this.config.getLogger().verbose(this.config.getAccountId(), "[Exception While Reading: " + e.getLocalizedMessage());
                if (fileInputStream != null) {
                }
                if (inputStreamReader != null) {
                }
                if (bufferedReader2 == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                th = th;
                r82 = fileInputStream2;
                if (r82 != 0) {
                    r82.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            inputStreamReader = null;
            bufferedReader2 = null;
            e = e11;
            fileInputStream = null;
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            r82 = 0;
        }
    }

    public void writeJsonToFile(String str, String str2, JSONObject jSONObject) throws IOException {
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        synchronized (FileUtils.class) {
                            try {
                                File file = new File(this.context.getFilesDir(), str);
                                if (!file.exists() && !file.mkdir()) {
                                    return;
                                }
                                FileWriter fileWriter2 = new FileWriter(new File(file, str2), false);
                                try {
                                    fileWriter2.append((CharSequence) jSONObject.toString());
                                    fileWriter2.flush();
                                    fileWriter2.close();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.config.getLogger().verbose(this.config.getAccountId(), "writeFileOnInternalStorage: failed" + e.getLocalizedMessage());
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
            } catch (Throwable th3) {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th3;
            }
        }
    }
}
