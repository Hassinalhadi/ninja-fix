package zendesk.support;

import java.io.File;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AttachmentFile implements Serializable {
    private File file;
    private String fileName;
    private String mimeType;

    public AttachmentFile(String str, String str2, File file) {
        this.fileName = str;
        this.mimeType = str2;
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getMimeType() {
        return this.mimeType;
    }
}
