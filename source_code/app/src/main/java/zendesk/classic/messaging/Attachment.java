package zendesk.classic.messaging;

import java.io.File;

/* loaded from: classes.dex */
public class Attachment {
    private final File file;
    private final String name;
    private final long size;
    private final String url;

    public Attachment(String str, long j5, String str2, File file) {
        this.name = str;
        this.size = j5;
        this.url = str2;
        this.file = file;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Attachment attachment = (Attachment) obj;
            if (this.size != attachment.size) {
                return false;
            }
            String str = this.name;
            if (str == null ? attachment.name != null : !str.equals(attachment.name)) {
                return false;
            }
            String str2 = this.url;
            if (str2 == null ? attachment.url != null : !str2.equals(attachment.url)) {
                return false;
            }
            File file = this.file;
            File file2 = attachment.file;
            if (file != null) {
                return file.equals(file2);
            }
            if (file2 == null) {
                return true;
            }
        }
        return false;
    }

    public File getFile() {
        return this.file;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i4;
        int i5;
        String str = this.name;
        int i10 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        long j5 = this.size;
        int i11 = ((i4 * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        File file = this.file;
        if (file != null) {
            i10 = file.hashCode();
        }
        return i12 + i10;
    }
}
