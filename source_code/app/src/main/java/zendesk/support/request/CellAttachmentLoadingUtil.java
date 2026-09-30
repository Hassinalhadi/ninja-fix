package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.PicassoTransformations;
import zendesk.support.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellAttachmentLoadingUtil {
    private static final String LOG_TAG = "AttachmentLoadingUtil";
    private final ImageLoadingLogic imageLoadingLogic;
    private final ImageSizingLogic imageSizingLogic;

    /* loaded from: classes.dex */
    public static class ImageLoadingLogic {
        private static final int IMAGE_DOWNSCALE_FACTOR = 2;
        private final Picasso picasso;

        /* loaded from: classes.dex */
        public static class DefaultDisplayStrategy implements LoadingStrategy {
            public /* synthetic */ DefaultDisplayStrategy(int i4) {
                this();
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
            }

            private DefaultDisplayStrategy() {
            }
        }

        /* loaded from: classes.dex */
        public static class DisplayImageFromLocalSource implements LoadingStrategy {
            private final RequestCreator requestCreator;

            public /* synthetic */ DisplayImageFromLocalSource(RequestCreator requestCreator, int i4) {
                this(requestCreator);
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.requestCreator.noPlaceholder().noFade(), imageDimensions, null);
            }

            private DisplayImageFromLocalSource(RequestCreator requestCreator) {
                this.requestCreator = requestCreator;
            }
        }

        /* loaded from: classes.dex */
        public static class DisplayImageFromWeb implements LoadingStrategy {
            final Picasso picasso;
            final String thumbnailUrl;
            final String url;

            public /* synthetic */ DisplayImageFromWeb(Picasso picasso, String str, String str2, int i4) {
                this(picasso, str, str2);
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(final ImageView imageView, final ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.picasso.load(this.thumbnailUrl).transform(PicassoTransformations.getBlurTransformation(imageView.getContext().getApplicationContext())), imageDimensions, new Callback() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.DisplayImageFromWeb.1
                    @Override // com.squareup.picasso.Callback
                    public void onError(Exception exc) {
                        Logger.d("RequestActivity", "Unable to load thumbnail. Url: '%s'", DisplayImageFromWeb.this.thumbnailUrl, exc);
                        ImageView imageView2 = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView2, displayImageFromWeb.picasso.load(displayImageFromWeb.url).noPlaceholder(), imageDimensions, null);
                    }

                    @Override // com.squareup.picasso.Callback
                    public void onSuccess() {
                        ImageView imageView2 = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView2, displayImageFromWeb.picasso.load(displayImageFromWeb.url).noPlaceholder(), imageDimensions, null);
                    }
                });
            }

            private DisplayImageFromWeb(Picasso picasso, String str, String str2) {
                this.picasso = picasso;
                this.url = str;
                this.thumbnailUrl = str2;
            }
        }

        /* loaded from: classes.dex */
        public interface LoadingStrategy {
            void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions);
        }

        public ImageLoadingLogic(Picasso picasso) {
            this.picasso = picasso;
        }

        private LoadingStrategy getLoadingStrategy(StateRequestAttachment stateRequestAttachment) {
            int i4 = 0;
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new DisplayImageFromLocalSource(this.picasso.load(stateRequestAttachment.getLocalFile()), i4);
            }
            if (StringUtils.hasLength(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new DisplayImageFromLocalSource(this.picasso.load(stateRequestAttachment.getParsedLocalUri()), i4);
            }
            if (StringUtils.hasLength(stateRequestAttachment.getUrl()) && StringUtils.hasLength(stateRequestAttachment.getThumbnailUrl())) {
                return new DisplayImageFromWeb(this.picasso, stateRequestAttachment.getUrl(), stateRequestAttachment.getThumbnailUrl(), i4);
            }
            Logger.d("RequestActivity", "Can't load image. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
            return new DefaultDisplayStrategy(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void loadImage(ImageView imageView, RequestCreator requestCreator, ImageSizingLogic.ImageDimensions imageDimensions, Callback callback) {
            requestCreator.transform(PicassoTransformations.getRoundedTransformation(imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.zs_request_attachment_corner_radius) / 2)).resize(imageDimensions.getImageWidth() / 2, imageDimensions.getImageHeight() / 2).centerCrop().into(imageView, callback);
        }

        public void initImageView(ImageView imageView) {
            this.picasso.cancelRequest(imageView);
            imageView.setImageResource(R.color.zs_color_transparent);
        }

        public boolean isImageLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            Object tag = imageView.getTag();
            if ((tag instanceof StateRequestAttachment) && ((StateRequestAttachment) tag).getId() == stateRequestAttachment.getId()) {
                return true;
            }
            return false;
        }

        public void loadAttachment(ImageView imageView, StateRequestAttachment stateRequestAttachment, ImageSizingLogic.ImageDimensions imageDimensions) {
            getLoadingStrategy(stateRequestAttachment).load(imageView, imageDimensions);
        }

        public void setImageViewLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            imageView.setTag(stateRequestAttachment);
        }
    }

    /* loaded from: classes.dex */
    public static class ImageSizingLogic {
        private static final double ASPECT_RATIO = 1.7777777777777777d;
        private final Map<String, ImageDimensions> cachedDimensions = new HashMap();
        private final ImageDimensions maxSize;
        private final Picasso picasso;

        /* loaded from: classes.dex */
        public static class DefaultStrategy implements DimensionStrategy {
            public /* synthetic */ DefaultStrategy(int i4) {
                this();
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(ZendeskCallback<ImageDimensions> zendeskCallback) {
                zendeskCallback.onSuccess(new ImageDimensions());
            }

            private DefaultStrategy() {
            }
        }

        /* loaded from: classes.dex */
        public interface DimensionStrategy {
            void findDimensions(ZendeskCallback<ImageDimensions> zendeskCallback);
        }

        /* loaded from: classes.dex */
        public static class ExistingDimensions implements DimensionStrategy {
            private final int height;
            private final ImageDimensions maxSize;
            private final int width;

            public ExistingDimensions(int i4, int i5, ImageDimensions imageDimensions) {
                this.width = i4;
                this.height = i5;
                this.maxSize = imageDimensions;
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(ZendeskCallback<ImageDimensions> zendeskCallback) {
                zendeskCallback.onSuccess(ImageSizingLogic.determineTargetDimensions(this.width, this.height, this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        /* loaded from: classes.dex */
        public static class ReadFromBitmap implements DimensionStrategy {
            final File file;
            private final ImageDimensions maxSize;

            public ReadFromBitmap(File file, ImageDimensions imageDimensions) {
                this.maxSize = imageDimensions;
                this.file = file;
            }

            private ImageDimensions loadImageDimensions(File file) {
                ImageDimensions imageDimensions = new ImageDimensions();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                imageDimensions.setDimensions(options.outWidth, options.outHeight);
                return imageDimensions;
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(ZendeskCallback<ImageDimensions> zendeskCallback) {
                ImageDimensions loadImageDimensions = loadImageDimensions(this.file);
                zendeskCallback.onSuccess(ImageSizingLogic.determineTargetDimensions(loadImageDimensions.getImageWidth(), loadImageDimensions.getImageHeight(), this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        /* loaded from: classes.dex */
        public static class ReadFromPicasso implements DimensionStrategy {
            private static final List<Target> TARGET_REFERENCE_TRAP = new ArrayList();
            private final ImageDimensions maxSize;
            private final RequestCreator requestCreator;

            public /* synthetic */ ReadFromPicasso(RequestCreator requestCreator, ImageDimensions imageDimensions, int i4) {
                this(requestCreator, imageDimensions);
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(final ZendeskCallback<ImageDimensions> zendeskCallback) {
                Target target = new Target() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.ReadFromPicasso.1
                    @Override // com.squareup.picasso.Target
                    public void onBitmapFailed(Exception exc, Drawable drawable) {
                        Logger.d("RequestActivity", "Unable to load image.", new Object[0]);
                        zendeskCallback.onSuccess(new ImageDimensions());
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    @Override // com.squareup.picasso.Target
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        zendeskCallback.onSuccess(ImageSizingLogic.determineTargetDimensions(bitmap.getWidth(), bitmap.getHeight(), ReadFromPicasso.this.maxSize.getImageWidth(), ReadFromPicasso.this.maxSize.getImageHeight()));
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    @Override // com.squareup.picasso.Target
                    public void onPrepareLoad(Drawable drawable) {
                    }
                };
                TARGET_REFERENCE_TRAP.add(target);
                this.requestCreator.into(target);
            }

            private ReadFromPicasso(RequestCreator requestCreator, ImageDimensions imageDimensions) {
                this.requestCreator = requestCreator;
                this.maxSize = imageDimensions;
            }
        }

        public ImageSizingLogic(Picasso picasso, Context context) {
            this.picasso = picasso;
            this.maxSize = getMaxSize(context);
        }

        private int calculateMaxWidth(Context context) {
            Resources resources = context.getResources();
            return (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_expanded_side_margin)) - resources.getDimensionPixelSize(R.dimen.zs_request_message_margin_side);
        }

        public static ImageDimensions determineTargetDimensions(int i4, int i5, int i10, int i11) {
            ImageDimensions imageDimensions = new ImageDimensions();
            int i12 = (int) (i10 / ((i4 * 1.0d) / i5));
            if (i4 > i5) {
                if (i4 > i10) {
                    i4 = i10;
                    i5 = i12;
                }
            } else if (i5 > i12) {
                i4 = Math.min(i10, i4);
                i5 = i12;
            }
            imageDimensions.setDimensions(i4, Math.max(Math.min(i11, i5), 0));
            return imageDimensions;
        }

        private DimensionStrategy getDimensionStrategy(StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            int i4 = 0;
            if (stateRequestAttachment.getHeight() > 0 && stateRequestAttachment.getWidth() > 0) {
                return new ExistingDimensions(stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight(), imageDimensions);
            }
            if (StringUtils.hasLength(stateRequestAttachment.getLocalUri()) && this.cachedDimensions.containsKey(stateRequestAttachment.getLocalUri())) {
                ImageDimensions imageDimensions2 = this.cachedDimensions.get(stateRequestAttachment.getLocalUri());
                return new ExistingDimensions(imageDimensions2.getImageWidth(), imageDimensions2.getImageHeight(), imageDimensions);
            }
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new ReadFromBitmap(stateRequestAttachment.getLocalFile(), imageDimensions);
            }
            if (StringUtils.hasLength(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new ReadFromPicasso(this.picasso.load(Uri.parse(stateRequestAttachment.getLocalUri())), imageDimensions, i4);
            }
            if (StringUtils.hasLength(stateRequestAttachment.getUrl())) {
                return new ReadFromPicasso(this.picasso.load(stateRequestAttachment.getUrl()), imageDimensions, i4);
            }
            Logger.d("RequestActivity", "Can't load dimensions. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
            return new DefaultStrategy(i4);
        }

        public ImageDimensions getMaxSize() {
            return this.maxSize;
        }

        public void loadDimensionsForAttachment(final StateRequestAttachment stateRequestAttachment, final ZendeskCallback<ImageDimensions> zendeskCallback) {
            getDimensionStrategy(stateRequestAttachment, this.maxSize).findDimensions(new ZendeskCallback<ImageDimensions>() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(ImageDimensions imageDimensions) {
                    if (StringUtils.hasLength(stateRequestAttachment.getLocalUri()) && imageDimensions.areKnown()) {
                        ImageSizingLogic.this.cachedDimensions.put(stateRequestAttachment.getLocalUri(), imageDimensions);
                    }
                    zendeskCallback.onSuccess(imageDimensions);
                }
            });
        }

        private ImageDimensions getMaxSize(Context context) {
            int calculateMaxWidth = calculateMaxWidth(context);
            return new ImageDimensions(calculateMaxWidth, (int) (calculateMaxWidth / ASPECT_RATIO));
        }

        /* loaded from: classes.dex */
        public static class ImageDimensions {
            private static final int UNKNOWN_DIMENSION = -1;
            private int imageHeight;
            private int imageWidth;

            public ImageDimensions(int i4, int i5) {
                this.imageWidth = i4;
                this.imageHeight = i5;
            }

            public boolean areKnown() {
                if (this.imageWidth != -1 && this.imageHeight != -1) {
                    return true;
                }
                return false;
            }

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public void setDimensions(int i4, int i5) {
                this.imageWidth = i4;
                this.imageHeight = i5;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ImageDimensions{width=");
                sb2.append(this.imageWidth);
                sb2.append(", height=");
                return Q0.c.quebec(sb2, this.imageHeight, '}');
            }

            public ImageDimensions() {
                this.imageWidth = -1;
                this.imageHeight = -1;
            }
        }
    }

    public CellAttachmentLoadingUtil(Picasso picasso, Context context) {
        this.imageSizingLogic = new ImageSizingLogic(picasso, context);
        this.imageLoadingLogic = new ImageLoadingLogic(picasso);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustImageViewDimensions(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageDimensions.getImageWidth();
        layoutParams.height = imageDimensions.getImageHeight();
        imageView.setLayoutParams(layoutParams);
    }

    public void bindImage(final ImageView imageView, final StateRequestAttachment stateRequestAttachment) {
        if (!this.imageLoadingLogic.isImageLoading(imageView, stateRequestAttachment)) {
            this.imageLoadingLogic.setImageViewLoading(imageView, stateRequestAttachment);
            adjustImageViewDimensions(imageView, this.imageSizingLogic.getMaxSize());
            this.imageLoadingLogic.initImageView(imageView);
            this.imageSizingLogic.loadDimensionsForAttachment(stateRequestAttachment, new ZendeskCallback<ImageSizingLogic.ImageDimensions>() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(ImageSizingLogic.ImageDimensions imageDimensions) {
                    if (imageDimensions.areKnown()) {
                        CellAttachmentLoadingUtil.this.adjustImageViewDimensions(imageView, imageDimensions);
                        CellAttachmentLoadingUtil.this.imageLoadingLogic.loadAttachment(imageView, stateRequestAttachment, imageDimensions);
                    } else {
                        Logger.d("RequestActivity", "Unable retrieve image size. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                    }
                }
            });
        }
    }
}
