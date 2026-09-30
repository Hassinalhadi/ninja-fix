package okhttp3.internal.idn;

import Tf.l;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "findSectionsIndex", "(I)I", "position", Constants.KEY_LIMIT, "findRangesOffset", "(III)I", "LTf/l;", "sink", "", "map", "(ILTf/l;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdnaMappingTable {

    @NotNull
    private final String mappings;

    @NotNull
    private final String ranges;

    @NotNull
    private final String sections;

    public IdnaMappingTable(@NotNull String sections, @NotNull String ranges, @NotNull String mappings) {
        Intrinsics.echo(sections, "sections");
        Intrinsics.echo(ranges, "ranges");
        Intrinsics.echo(mappings, "mappings");
        this.sections = sections;
        this.ranges = ranges;
        this.mappings = mappings;
    }

    private final int findRangesOffset(int codePoint, int position, int limit) {
        int i4;
        int i5 = codePoint & 127;
        int i10 = limit - 1;
        while (true) {
            if (position <= i10) {
                i4 = (position + i10) / 2;
                int golf = Intrinsics.golf(i5, this.ranges.charAt(i4 * 4));
                if (golf < 0) {
                    i10 = i4 - 1;
                } else {
                    if (golf <= 0) {
                        break;
                    }
                    position = i4 + 1;
                }
            } else {
                i4 = (-position) - 1;
                break;
            }
        }
        if (i4 >= 0) {
            return i4 * 4;
        }
        return ((-i4) - 2) * 4;
    }

    private final int findSectionsIndex(int codePoint) {
        int i4;
        int i5 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= length) {
                i4 = (i10 + length) / 2;
                int golf = Intrinsics.golf(i5, IdnaMappingTableKt.read14BitInt(this.sections, i4 * 4));
                if (golf < 0) {
                    length = i4 - 1;
                } else {
                    if (golf <= 0) {
                        break;
                    }
                    i10 = i4 + 1;
                }
            } else {
                i4 = (-i10) - 1;
                break;
            }
        }
        if (i4 >= 0) {
            return i4 * 4;
        }
        return ((-i4) - 2) * 4;
    }

    @NotNull
    public final String getMappings() {
        return this.mappings;
    }

    @NotNull
    public final String getRanges() {
        return this.ranges;
    }

    @NotNull
    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int codePoint, @NotNull l sink) {
        int length;
        Intrinsics.echo(sink, "sink");
        int findSectionsIndex = findSectionsIndex(codePoint);
        int read14BitInt = IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 2);
        if (findSectionsIndex + 4 < this.sections.length()) {
            length = IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 6);
        } else {
            length = this.ranges.length() / 4;
        }
        int findRangesOffset = findRangesOffset(codePoint, read14BitInt, length);
        char charAt = this.ranges.charAt(findRangesOffset + 1);
        if (charAt >= 0 && charAt < '@') {
            int read14BitInt2 = IdnaMappingTableKt.read14BitInt(this.ranges, findRangesOffset + 2);
            sink.teal(read14BitInt2, charAt + read14BitInt2, this.mappings);
            return true;
        }
        if ('@' <= charAt && charAt < 'P') {
            sink.tango(codePoint - (this.ranges.charAt(findRangesOffset + 3) | (((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= charAt && charAt < '`') {
            sink.tango(codePoint + (this.ranges.charAt(findRangesOffset + 3) | ((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7)));
            return true;
        }
        if (charAt != 'w') {
            if (charAt == 'x') {
                sink.tango(codePoint);
                return true;
            }
            if (charAt == 'y') {
                sink.tango(codePoint);
                return false;
            }
            if (charAt == 'z') {
                sink.black(this.ranges.charAt(findRangesOffset + 2));
                return true;
            }
            if (charAt == '{') {
                sink.black(this.ranges.charAt(findRangesOffset + 2) | 128);
                return true;
            }
            if (charAt == '|') {
                sink.black(this.ranges.charAt(findRangesOffset + 2));
                sink.black(this.ranges.charAt(findRangesOffset + 3));
                return true;
            }
            if (charAt == '}') {
                sink.black(this.ranges.charAt(findRangesOffset + 2) | 128);
                sink.black(this.ranges.charAt(findRangesOffset + 3));
                return true;
            }
            if (charAt == '~') {
                sink.black(this.ranges.charAt(findRangesOffset + 2));
                sink.black(this.ranges.charAt(findRangesOffset + 3) | 128);
                return true;
            }
            if (charAt == 127) {
                sink.black(this.ranges.charAt(findRangesOffset + 2) | 128);
                sink.black(this.ranges.charAt(findRangesOffset + 3) | 128);
                return true;
            }
            throw new IllegalStateException(("unexpected rangesIndex for " + codePoint).toString());
        }
        return true;
    }
}
