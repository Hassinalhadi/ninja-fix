package zendesk.support.request;

import android.net.Uri;
import androidx.appcompat.widget.P0;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.FileUtils;
import com.zendesk.util.MimeUtils;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r1.C2483b;
import zendesk.support.Attachment;
import zendesk.support.AttachmentFile;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateRequestAttachment implements Serializable, Comparable<StateRequestAttachment> {
    private static final String DEFAULT_MIME_TYPE = "application/octet-stream";
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final long f14286id;
    private final transient File localFile;
    private final String localUri;
    private final String mimeType;
    private final String name;
    private final long size;
    private final String thumbnailUrl;
    private final String token;
    private final String url;
    private final int width;

    /* loaded from: classes.dex */
    public static class Builder {
        private int height;

        /* renamed from: id, reason: collision with root package name */
        private long f14287id;
        private File localFile;
        private String localUri;
        private String mimeType;
        private String name;
        private long size;
        private String thumbnailUrl;
        private String token;
        private String url;
        private int width;

        public /* synthetic */ Builder(StateRequestAttachment stateRequestAttachment, int i4) {
            this(stateRequestAttachment);
        }

        public StateRequestAttachment build() {
            return new StateRequestAttachment(this, 0);
        }

        public Builder setHeight(int i4) {
            this.height = i4;
            return this;
        }

        public Builder setId(long j5) {
            this.f14287id = j5;
            return this;
        }

        public Builder setLocalFile(File file) {
            this.localFile = file;
            return this;
        }

        public Builder setLocalUri(String str) {
            this.localUri = str;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setSize(long j5) {
            this.size = j5;
            return this;
        }

        public void setThumbnailUrl(String str) {
            this.thumbnailUrl = str;
        }

        public Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder setWidth(int i4) {
            this.width = i4;
            return this;
        }

        private Builder(StateRequestAttachment stateRequestAttachment) {
            this.f14287id = stateRequestAttachment.getId();
            this.localFile = stateRequestAttachment.getLocalFile();
            this.localUri = stateRequestAttachment.getLocalUri();
            this.url = stateRequestAttachment.getUrl();
            this.token = stateRequestAttachment.getToken();
            this.mimeType = stateRequestAttachment.getMimeType();
            this.name = stateRequestAttachment.getName();
            this.size = stateRequestAttachment.getSize();
            this.width = stateRequestAttachment.getWidth();
            this.height = stateRequestAttachment.getHeight();
            this.thumbnailUrl = stateRequestAttachment.getThumbnailUrl();
        }
    }

    public /* synthetic */ StateRequestAttachment(Builder builder, int i4) {
        this(builder);
    }

    public static C2483b convert(List<CommentResponse> list, Map<Long, MediaResult> map, StateIdMapper stateIdMapper) {
        ArrayList arrayList = new ArrayList();
        Iterator<CommentResponse> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAttachments());
        }
        return convert(arrayList, stateIdMapper, map);
    }

    private static String getMimeTypeForFile(File file) {
        return MimeUtils.guessMimeTypeFromExtension(FileUtils.getFileExtension(file.getName()));
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.f14286id;
    }

    public File getLocalFile() {
        return this.localFile;
    }

    public String getLocalUri() {
        return this.localUri;
    }

    public String getMimeType() {
        if (StringUtils.hasLength(this.mimeType)) {
            return this.mimeType;
        }
        return DEFAULT_MIME_TYPE;
    }

    public String getName() {
        return this.name;
    }

    public Uri getParsedLocalUri() {
        return Uri.parse(this.localUri);
    }

    public long getSize() {
        return this.size;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAvailableLocally() {
        if (this.localUri != null && getParsedLocalUri() != null && this.localFile != null) {
            return true;
        }
        return false;
    }

    public Builder newBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestAttachment{id=");
        sb2.append(this.f14286id);
        sb2.append(", localUri='");
        sb2.append(this.localUri);
        sb2.append("', localFile=");
        sb2.append(this.localFile);
        sb2.append(", url='");
        sb2.append(this.url);
        sb2.append("', token='");
        sb2.append(this.token);
        sb2.append("', mimeType='");
        sb2.append(this.mimeType);
        sb2.append("', name='");
        sb2.append(this.name);
        sb2.append("', size='");
        sb2.append(this.size);
        sb2.append("', width='");
        sb2.append(this.width);
        sb2.append("', height='");
        return P0.cyan(sb2, this.height, "'}");
    }

    public StateRequestAttachment(long j5, String str, File file, String str2, String str3, String str4, String str5, long j6, int i4, int i5, String str6) {
        this.f14286id = j5;
        this.localUri = str;
        this.localFile = file;
        this.url = str2;
        this.token = str3;
        this.mimeType = str4;
        this.name = str5;
        this.size = j6;
        this.width = i4;
        this.height = i5;
        this.thumbnailUrl = str6;
    }

    @Override // java.lang.Comparable
    public int compareTo(StateRequestAttachment stateRequestAttachment) {
        return (int) (this.f14286id - stateRequestAttachment.f14286id);
    }

    public static C2483b convert(List<Attachment> list, StateIdMapper stateIdMapper, Map<Long, MediaResult> map) {
        long newLongId;
        String str;
        File file;
        String str2;
        HashMap hashMap = new HashMap(list.size());
        for (Attachment attachment : list) {
            if (attachment.getId() != null) {
                if (stateIdMapper.hasLocalId(attachment.getId())) {
                    newLongId = stateIdMapper.getLocalId(attachment.getId()).longValue();
                } else {
                    newLongId = IdUtil.newLongId();
                    stateIdMapper.addIdMapping(attachment.getId(), Long.valueOf(newLongId));
                }
                long j5 = newLongId;
                if (map.containsKey(attachment.getId())) {
                    MediaResult mediaResult = map.get(attachment.getId());
                    File file2 = mediaResult.getFile();
                    str = mediaResult.getUri().toString();
                    file = file2;
                } else {
                    str = null;
                    file = null;
                }
                long longValue = attachment.getSize() != null ? attachment.getSize().longValue() : -1L;
                long longValue2 = attachment.getWidth() != null ? attachment.getWidth().longValue() : -1L;
                long longValue3 = attachment.getHeight() != null ? attachment.getHeight().longValue() : -1L;
                if (CollectionUtils.isNotEmpty(attachment.getThumbnails())) {
                    str2 = attachment.getThumbnails().get(0).getContentUrl();
                } else {
                    str2 = "";
                }
                hashMap.put(attachment.getId(), new StateRequestAttachment(j5, str, file, attachment.getContentUrl(), "", attachment.getContentType(), attachment.getFileName(), longValue, (int) longValue2, (int) longValue3, str2));
            }
        }
        return new C2483b(hashMap, stateIdMapper);
    }

    private StateRequestAttachment(Builder builder) {
        this.localFile = builder.localFile;
        this.localUri = builder.localUri;
        this.mimeType = builder.mimeType;
        this.name = builder.name;
        this.f14286id = builder.f14287id;
        this.url = builder.url;
        this.token = builder.token;
        this.size = builder.size;
        this.width = builder.width;
        this.height = builder.height;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    public static StateRequestAttachment convert(MediaResult mediaResult) {
        return new StateRequestAttachment(IdUtil.newLongId(), mediaResult.getUri().toString(), mediaResult.getFile(), "", "", mediaResult.getMimeType(), mediaResult.getName(), mediaResult.getSize(), (int) mediaResult.getWidth(), (int) mediaResult.getHeight(), "");
    }

    public static StateRequestAttachment convert(File file) {
        return new StateRequestAttachment(IdUtil.newLongId(), Uri.fromFile(file).toString(), file, "", "", getMimeTypeForFile(file), file.getName(), file.length(), -1, -1, "");
    }

    public static StateRequestAttachment convert(AttachmentFile attachmentFile) {
        return new StateRequestAttachment(IdUtil.newLongId(), Uri.fromFile(attachmentFile.getFile()).toString(), attachmentFile.getFile(), "", "", getMimeTypeForFile(attachmentFile.getFile()), attachmentFile.getFileName(), attachmentFile.getFile().length(), -1, -1, "");
    }

    public static MediaResult convert(StateRequestAttachment stateRequestAttachment) {
        return new MediaResult(stateRequestAttachment.getLocalFile(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getName(), stateRequestAttachment.getMimeType(), stateRequestAttachment.getSize(), stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight());
    }
}
