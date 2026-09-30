package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import zendesk.support.R;
import zendesk.support.suas.Dispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AdapterAttachmentCarousel extends az {
    private static final int FILE_ATTACHMENT = 1;
    private static final int IMAGE_ATTACHMENT = 2;

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14269af;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final MediaResultUtility mediaResultUtility;
    private final Picasso picasso;
    private final CarouselViewHolder.OnRemoveListener removeListener = new CarouselViewHolder.OnRemoveListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.1
        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder.OnRemoveListener
        public void onRemove(StateRequestAttachment stateRequestAttachment) {
            AdapterAttachmentCarousel.this.dispatcher.dispatch(AdapterAttachmentCarousel.this.f14269af.deselectAttachment(Collections.singletonList(StateRequestAttachment.convert(stateRequestAttachment))));
        }
    };

    /* loaded from: classes.dex */
    public static abstract class CarouselViewHolder extends f0 {

        /* loaded from: classes.dex */
        public interface OnRemoveListener {
            void onRemove(StateRequestAttachment stateRequestAttachment);
        }

        public CarouselViewHolder(View view) {
            super(view);
        }

        public abstract void bind(StateRequestAttachment stateRequestAttachment, OnRemoveListener onRemoveListener);
    }

    /* loaded from: classes.dex */
    public static class FileAttachmentViewHolder extends CarouselViewHolder {
        private final ImageView appIcon;
        private final TextView appName;
        private final View container;
        private final MediaResultUtility mediaResultUtility;
        private final TextView name;
        private final View remove;

        public FileAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, MediaResultUtility mediaResultUtility) {
            super(layoutInflater.inflate(R.layout.zs_request_carousel_file, viewGroup, false));
            this.name = (TextView) this.itemView.findViewById(R.id.request_attachment_carousel_file_title);
            this.appIcon = (ImageView) this.itemView.findViewById(R.id.request_attachment_carousel_file_icon);
            this.appName = (TextView) this.itemView.findViewById(R.id.request_attachment_carousel_file_app_name);
            this.remove = this.itemView.findViewById(R.id.request_attachment_carousel_remove);
            this.container = this.itemView.findViewById(R.id.request_attachment_file_carousel_container);
            this.mediaResultUtility = mediaResultUtility;
        }

        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            Context context = this.itemView.getContext();
            ResolveInfo appInfoForFile = UtilsAttachment.getAppInfoForFile(context, this.mediaResultUtility.getMediaResultFromFile("tmp", stateRequestAttachment.getName()));
            this.appIcon.setImageDrawable(UtilsAttachment.getAppIcon(context, appInfoForFile));
            this.appName.setText(UtilsAttachment.getAppName(context, appInfoForFile));
            this.name.setText(stateRequestAttachment.getName());
            this.remove.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.FileAttachmentViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            this.remove.setContentDescription(context.getString(R.string.zs_request_attachment_carousel_remove_attachment_accessibility, stateRequestAttachment.getName()));
            this.container.setContentDescription(context.getString(R.string.zs_request_attachment_carousel_attachment_accessibility, stateRequestAttachment.getName()));
        }
    }

    /* loaded from: classes.dex */
    public static class ImageAttachmentViewHolder extends CarouselViewHolder {
        private final View container;
        private final ImageView imageView;
        private final Picasso picasso;
        private final View remove;

        public ImageAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
            super(layoutInflater.inflate(R.layout.zs_request_carousel_image, viewGroup, false));
            this.imageView = (ImageView) this.itemView.findViewById(R.id.request_attachment_carousel_image);
            this.remove = this.itemView.findViewById(R.id.request_attachment_carousel_remove);
            this.container = this.itemView.findViewById(R.id.request_attachment_image_carousel_container);
            this.picasso = picasso;
        }

        @Override // zendesk.support.request.AdapterAttachmentCarousel.CarouselViewHolder
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            this.picasso.load(stateRequestAttachment.getParsedLocalUri()).fit().centerCrop().into(this.imageView);
            this.remove.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.AdapterAttachmentCarousel.ImageAttachmentViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            Context context = this.itemView.getContext();
            this.remove.setContentDescription(context.getString(R.string.zs_request_attachment_carousel_remove_attachment_accessibility, stateRequestAttachment.getName()));
            this.container.setContentDescription(context.getString(R.string.zs_request_attachment_carousel_attachment_accessibility, stateRequestAttachment.getName()));
        }
    }

    public AdapterAttachmentCarousel(AttachmentHelper attachmentHelper, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher, MediaResultUtility mediaResultUtility) {
        this.attachmentHelper = attachmentHelper;
        this.picasso = picasso;
        this.f14269af = actionFactory;
        this.dispatcher = dispatcher;
        this.mediaResultUtility = mediaResultUtility;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.attachmentHelper.getSelectedAttachments().size();
    }

    @Override // androidx.recyclerview.widget.az
    public long getItemId(int i4) {
        return this.attachmentHelper.getSelectedAttachments().get(i4).getLocalUri().hashCode();
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        if (UtilsAttachment.isImageAttachment(this.attachmentHelper.getSelectedAttachments().get(i4))) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(CarouselViewHolder carouselViewHolder, int i4) {
        carouselViewHolder.bind(this.attachmentHelper.getSelectedAttachments().get(i4), this.removeListener);
    }

    @Override // androidx.recyclerview.widget.az
    public CarouselViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i4 == 1) {
            return new FileAttachmentViewHolder(from, viewGroup, this.mediaResultUtility);
        }
        if (i4 != 2) {
            return null;
        }
        return new ImageAttachmentViewHolder(from, viewGroup, this.picasso);
    }
}
