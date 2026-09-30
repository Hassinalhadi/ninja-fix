package zendesk.support.request;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.core.MediaFileResolver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaResultUtility {
    static final String LOG_TAG = "MediaResultUtility";
    private static final String MIME_TYPE_IMAGE = "image";
    static final String TEMPORARY_DIR = "tmp";
    private final Context context;
    private final MediaFileResolver mediaFileResolver;

    public MediaResultUtility(Context context, MediaFileResolver mediaFileResolver) {
        this.context = context;
        this.mediaFileResolver = mediaFileResolver;
    }

    public static MediaResult getMediaResultForUri(Context context, Uri uri) {
        Uri uri2;
        long j5;
        String str;
        String str2;
        long j6 = -1;
        String str3 = "";
        if (Constants.KEY_CONTENT.equals(uri.getScheme())) {
            ContentResolver contentResolver = context.getContentResolver();
            uri2 = uri;
            Cursor query = contentResolver.query(uri2, new String[]{"_size", "_display_name"}, null, null, null);
            String type = contentResolver.getType(uri2);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_size");
                        int columnIndex2 = query.getColumnIndex("_display_name");
                        if (columnIndex != -1) {
                            j6 = query.getLong(columnIndex);
                        }
                        if (columnIndex2 != -1) {
                            str3 = query.getString(columnIndex2);
                        }
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            j5 = j6;
            str = str3;
            str2 = type;
        } else {
            uri2 = uri;
            j5 = -1;
            str = "";
            str2 = str;
        }
        return new MediaResult(null, uri2, uri, str, str2, j5, -1L, -1L);
    }

    public Uri createUriToSaveTakenPicture() {
        return this.mediaFileResolver.createUriToSaveTakenPicture();
    }

    public MediaResult getFile(String str, long j5, String str2) {
        return getMediaResultFromFile(UtilsAttachment.getAttachmentSubDir(str, j5), str2);
    }

    public List<MediaResult> getListOfSelectedMedia(List<Uri> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getMediaInfoFromUri(it.next()));
            }
        }
        return arrayList;
    }

    public MediaResult getLocalFile(String str, long j5, String str2) {
        return getMediaResultFromFile(UtilsAttachment.getAttachmentSubDir(UtilsAttachment.getCacheDirForRequestId(str), j5), str2);
    }

    public MediaResult getMediaInfoFromUri(Uri uri) {
        ContentResolver contentResolver = this.context.getContentResolver();
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query != null && query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("_display_name");
            int columnIndex2 = query.getColumnIndex("_size");
            String string = query.getString(columnIndex);
            long j5 = query.getLong(columnIndex2);
            String type = contentResolver.getType(uri);
            if (type == null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
            }
            query.close();
            return new MediaResult(null, uri, uri, string, type, j5, -1L, -1L);
        }
        System.out.println("Failed to retrieve file details.");
        return null;
    }

    public MediaResult getMediaResultFromFile(String str, String str2) {
        Uri fileProviderUri;
        long j5;
        long j6;
        File createCacheFile = this.mediaFileResolver.createCacheFile(str, str2);
        if (createCacheFile != null && (fileProviderUri = this.mediaFileResolver.getFileProviderUri(this.context, createCacheFile)) != null) {
            MediaResult mediaResultForUri = getMediaResultForUri(this.context, fileProviderUri);
            if (mediaResultForUri.getMimeType().contains(MIME_TYPE_IMAGE)) {
                Pair<Integer, Integer> imageDimensions = this.mediaFileResolver.getImageDimensions(createCacheFile);
                long intValue = ((Integer) imageDimensions.first).intValue();
                j6 = ((Integer) imageDimensions.second).intValue();
                j5 = intValue;
            } else {
                j5 = -1;
                j6 = -1;
            }
            return new MediaResult(createCacheFile, fileProviderUri, fileProviderUri, str2, mediaResultForUri.getMimeType(), mediaResultForUri.getSize(), j5, j6);
        }
        return null;
    }

    public List<MediaResult> getResolvedUris(List<Uri> list, String str) {
        int i4;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[1048576];
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        for (Uri uri : list) {
            try {
                try {
                    try {
                        try {
                            inputStream = this.context.getContentResolver().openInputStream(uri);
                            File fileForUri = this.mediaFileResolver.getFileForUri(uri, str);
                            if (inputStream == null || fileForUri == null) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                                try {
                                    Log.d(LOG_TAG, String.format(Locale.US, "Copying media file into private cache - Uri: %s - Dest: %s", uri, fileForUri));
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileForUri);
                                    while (true) {
                                        try {
                                            int read = inputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream2.write(bArr, 0, read);
                                        } catch (FileNotFoundException e) {
                                            e = e;
                                            fileOutputStream = fileOutputStream2;
                                            Log.e(LOG_TAG, String.format(Locale.US, "File not found error copying file, uri: %s", uri), e);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e4) {
                                                    Log.e(LOG_TAG, "Error closing InputStream", e4);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e5) {
                                                    Log.e(LOG_TAG, "Error closing FileOutputStream", e5);
                                                }
                                            }
                                        } catch (IOException e10) {
                                            e = e10;
                                            fileOutputStream = fileOutputStream2;
                                            Log.e(LOG_TAG, String.format(Locale.US, "IO Error copying file, uri: %s", uri), e);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e11) {
                                                    Log.e(LOG_TAG, "Error closing InputStream", e11);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e12) {
                                                    e = e12;
                                                    Log.e(LOG_TAG, "Error closing FileOutputStream", e);
                                                }
                                            }
                                        } catch (IllegalStateException e13) {
                                            e = e13;
                                            fileOutputStream = fileOutputStream2;
                                            Locale locale = Locale.US;
                                            Object[] objArr = new Object[i4];
                                            objArr[0] = uri;
                                            Log.e(LOG_TAG, String.format(locale, "The file is either partially downloaded or corrupted, uri: %s", objArr), e);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e14) {
                                                    Log.e(LOG_TAG, "Error closing InputStream", e14);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e15) {
                                                    e = e15;
                                                    Log.e(LOG_TAG, "Error closing FileOutputStream", e);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            Throwable th2 = th;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e16) {
                                                    Log.e(LOG_TAG, "Error closing InputStream", e16);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                    throw th2;
                                                } catch (IOException e17) {
                                                    Log.e(LOG_TAG, "Error closing FileOutputStream", e17);
                                                    throw th2;
                                                }
                                            }
                                            throw th2;
                                        }
                                    }
                                    MediaResult mediaResultForUri = getMediaResultForUri(this.context, uri);
                                    arrayList.add(new MediaResult(fileForUri, this.mediaFileResolver.getFileProviderUri(this.context, fileForUri), uri, fileForUri.getName(), mediaResultForUri.getMimeType(), mediaResultForUri.getSize(), mediaResultForUri.getWidth(), mediaResultForUri.getHeight()));
                                    fileOutputStream = fileOutputStream2;
                                } catch (IllegalStateException e18) {
                                    e = e18;
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e19) {
                                    Log.e(LOG_TAG, "Error closing InputStream", e19);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e20) {
                                    Log.e(LOG_TAG, "Error closing FileOutputStream", e20);
                                }
                            }
                        } catch (FileNotFoundException e21) {
                            e = e21;
                        } catch (IOException e22) {
                            e = e22;
                        }
                    } catch (IllegalStateException e23) {
                        e = e23;
                        i4 = 1;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e24) {
                e = e24;
            } catch (IOException e25) {
                e = e25;
            }
        }
        return arrayList;
    }

    public List<MediaResult> getListOfSelectedMedia(Uri uri) {
        ArrayList arrayList = new ArrayList();
        if (uri != null) {
            arrayList.add(getMediaInfoFromUri(uri));
        }
        return arrayList;
    }
}
