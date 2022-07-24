package com.developer.mk.newstime.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

// we will add the category model class inside this
// general homepage model class

public class HomepageModel {

    @SerializedName("banners")
    @Expose
    private List<Banner> banners = null;

    @SerializedName("ads")
    @Expose
    private List<Ad> ads = null;

    @SerializedName("News")
    @Expose
    private List<News> news = null;

    @SerializedName("CategoryBotton")
    @Expose
    private List<CategoryBotton> categoryBotton = null;

    public List<CategoryBotton> getCategoryBotton() {
        return categoryBotton;
    }

    public void setCategoryBotton(List<CategoryBotton> categoryBotton) {
        this.categoryBotton = categoryBotton;
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public HomepageModel() {
    }

    /**
     *
     * @param news
     * @param ads
     * @param banners
     */
    public HomepageModel(List<Banner> banners, List<Ad> ads, List<News> news) {
        super();
        this.banners = banners;
        this.ads = ads;
        this.news = news;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }


    public class News {

        @SerializedName("pid")
        @Expose
        private Integer pid;
        @SerializedName("post_date")
        @Expose
        private String postDate;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("post_content")
        @Expose
        private String postContent;
        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("sourceUrl")
        @Expose
        private String sourceUrl;
        @SerializedName("source_logo")
        @Expose
        private SourceLogo sourceLogo;
        @SerializedName("image")
        @Expose
        private String image;

        /**
         * No args constructor for use in serialization
         *
         */
        public News() {
        }

        /**
         *
         * @param sourceUrl
         * @param image
         * @param postContent
         * @param postDate
         * @param pid
         * @param source
         * @param sourceLogo
         * @param title
         * @param url
         */
        public News(Integer pid, String postDate, String title, String url, String postContent, String source, String sourceUrl, SourceLogo sourceLogo, String image) {
            super();
            this.pid = pid;
            this.postDate = postDate;
            this.title = title;
            this.url = url;
            this.postContent = postContent;
            this.source = source;
            this.sourceUrl = sourceUrl;
            this.sourceLogo = sourceLogo;
            this.image = image;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public String getPostDate() {
            return postDate;
        }

        public void setPostDate(String postDate) {
            this.postDate = postDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPostContent() {
            return postContent;
        }

        public void setPostContent(String postContent) {
            this.postContent = postContent;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public SourceLogo getSourceLogo() {
            return sourceLogo;
        }

        public void setSourceLogo(SourceLogo sourceLogo) {
            this.sourceLogo = sourceLogo;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }


    public class Sizes {

        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("thumbnail-width")
        @Expose
        private Integer thumbnailWidth;
        @SerializedName("thumbnail-height")
        @Expose
        private Integer thumbnailHeight;
        @SerializedName("medium")
        @Expose
        private String medium;
        @SerializedName("medium-width")
        @Expose
        private Integer mediumWidth;
        @SerializedName("medium-height")
        @Expose
        private Integer mediumHeight;
        @SerializedName("medium_large")
        @Expose
        private String mediumLarge;
        @SerializedName("medium_large-width")
        @Expose
        private Integer mediumLargeWidth;
        @SerializedName("medium_large-height")
        @Expose
        private Integer mediumLargeHeight;
        @SerializedName("large")
        @Expose
        private String large;
        @SerializedName("large-width")
        @Expose
        private Integer largeWidth;
        @SerializedName("large-height")
        @Expose
        private Integer largeHeight;
        @SerializedName("1536x1536")
        @Expose
        private String _1536x1536;
        @SerializedName("1536x1536-width")
        @Expose
        private Integer _1536x1536Width;
        @SerializedName("1536x1536-height")
        @Expose
        private Integer _1536x1536Height;
        @SerializedName("2048x2048")
        @Expose
        private String _2048x2048;
        @SerializedName("2048x2048-width")
        @Expose
        private Integer _2048x2048Width;
        @SerializedName("2048x2048-height")
        @Expose
        private Integer _2048x2048Height;
        @SerializedName("post-thumbnail")
        @Expose
        private String postThumbnail;
        @SerializedName("post-thumbnail-width")
        @Expose
        private Integer postThumbnailWidth;
        @SerializedName("post-thumbnail-height")
        @Expose
        private Integer postThumbnailHeight;
        @SerializedName("twentytwenty-fullscreen")
        @Expose
        private String twentytwentyFullscreen;
        @SerializedName("twentytwenty-fullscreen-width")
        @Expose
        private Integer twentytwentyFullscreenWidth;
        @SerializedName("twentytwenty-fullscreen-height")
        @Expose
        private Integer twentytwentyFullscreenHeight;

        /**
         * No args constructor for use in serialization
         *
         */
        public Sizes() {
        }

        /**
         *
         * @param mediumLarge
         * @param thumbnail
         * @param _2048x2048Height
         * @param large
         * @param _2048x2048
         * @param postThumbnailHeight
         * @param _1536x1536Width
         * @param medium
         * @param thumbnailWidth
         * @param twentytwentyFullscreenHeight
         * @param largeWidth
         * @param _2048x2048Width
         * @param postThumbnailWidth
         * @param mediumHeight
         * @param postThumbnail
         * @param mediumWidth
         * @param mediumLargeWidth
         * @param _1536x1536Height
         * @param largeHeight
         * @param _1536x1536
         * @param twentytwentyFullscreenWidth
         * @param thumbnailHeight
         * @param mediumLargeHeight
         * @param twentytwentyFullscreen
         */
        public Sizes(String thumbnail, Integer thumbnailWidth, Integer thumbnailHeight, String medium, Integer mediumWidth, Integer mediumHeight, String mediumLarge, Integer mediumLargeWidth, Integer mediumLargeHeight, String large, Integer largeWidth, Integer largeHeight, String _1536x1536, Integer _1536x1536Width, Integer _1536x1536Height, String _2048x2048, Integer _2048x2048Width, Integer _2048x2048Height, String postThumbnail, Integer postThumbnailWidth, Integer postThumbnailHeight, String twentytwentyFullscreen, Integer twentytwentyFullscreenWidth, Integer twentytwentyFullscreenHeight) {
            super();
            this.thumbnail = thumbnail;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.medium = medium;
            this.mediumWidth = mediumWidth;
            this.mediumHeight = mediumHeight;
            this.mediumLarge = mediumLarge;
            this.mediumLargeWidth = mediumLargeWidth;
            this.mediumLargeHeight = mediumLargeHeight;
            this.large = large;
            this.largeWidth = largeWidth;
            this.largeHeight = largeHeight;
            this._1536x1536 = _1536x1536;
            this._1536x1536Width = _1536x1536Width;
            this._1536x1536Height = _1536x1536Height;
            this._2048x2048 = _2048x2048;
            this._2048x2048Width = _2048x2048Width;
            this._2048x2048Height = _2048x2048Height;
            this.postThumbnail = postThumbnail;
            this.postThumbnailWidth = postThumbnailWidth;
            this.postThumbnailHeight = postThumbnailHeight;
            this.twentytwentyFullscreen = twentytwentyFullscreen;
            this.twentytwentyFullscreenWidth = twentytwentyFullscreenWidth;
            this.twentytwentyFullscreenHeight = twentytwentyFullscreenHeight;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public Integer getThumbnailWidth() {
            return thumbnailWidth;
        }

        public void setThumbnailWidth(Integer thumbnailWidth) {
            this.thumbnailWidth = thumbnailWidth;
        }

        public Integer getThumbnailHeight() {
            return thumbnailHeight;
        }

        public void setThumbnailHeight(Integer thumbnailHeight) {
            this.thumbnailHeight = thumbnailHeight;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public Integer getMediumWidth() {
            return mediumWidth;
        }

        public void setMediumWidth(Integer mediumWidth) {
            this.mediumWidth = mediumWidth;
        }

        public Integer getMediumHeight() {
            return mediumHeight;
        }

        public void setMediumHeight(Integer mediumHeight) {
            this.mediumHeight = mediumHeight;
        }

        public String getMediumLarge() {
            return mediumLarge;
        }

        public void setMediumLarge(String mediumLarge) {
            this.mediumLarge = mediumLarge;
        }

        public Integer getMediumLargeWidth() {
            return mediumLargeWidth;
        }

        public void setMediumLargeWidth(Integer mediumLargeWidth) {
            this.mediumLargeWidth = mediumLargeWidth;
        }

        public Integer getMediumLargeHeight() {
            return mediumLargeHeight;
        }

        public void setMediumLargeHeight(Integer mediumLargeHeight) {
            this.mediumLargeHeight = mediumLargeHeight;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public Integer getLargeWidth() {
            return largeWidth;
        }

        public void setLargeWidth(Integer largeWidth) {
            this.largeWidth = largeWidth;
        }

        public Integer getLargeHeight() {
            return largeHeight;
        }

        public void setLargeHeight(Integer largeHeight) {
            this.largeHeight = largeHeight;
        }

        public String get1536x1536() {
            return _1536x1536;
        }

        public void set1536x1536(String _1536x1536) {
            this._1536x1536 = _1536x1536;
        }

        public Integer get1536x1536Width() {
            return _1536x1536Width;
        }

        public void set1536x1536Width(Integer _1536x1536Width) {
            this._1536x1536Width = _1536x1536Width;
        }

        public Integer get1536x1536Height() {
            return _1536x1536Height;
        }

        public void set1536x1536Height(Integer _1536x1536Height) {
            this._1536x1536Height = _1536x1536Height;
        }

        public String get2048x2048() {
            return _2048x2048;
        }

        public void set2048x2048(String _2048x2048) {
            this._2048x2048 = _2048x2048;
        }

        public Integer get2048x2048Width() {
            return _2048x2048Width;
        }

        public void set2048x2048Width(Integer _2048x2048Width) {
            this._2048x2048Width = _2048x2048Width;
        }

        public Integer get2048x2048Height() {
            return _2048x2048Height;
        }

        public void set2048x2048Height(Integer _2048x2048Height) {
            this._2048x2048Height = _2048x2048Height;
        }

        public String getPostThumbnail() {
            return postThumbnail;
        }

        public void setPostThumbnail(String postThumbnail) {
            this.postThumbnail = postThumbnail;
        }

        public Integer getPostThumbnailWidth() {
            return postThumbnailWidth;
        }

        public void setPostThumbnailWidth(Integer postThumbnailWidth) {
            this.postThumbnailWidth = postThumbnailWidth;
        }

        public Integer getPostThumbnailHeight() {
            return postThumbnailHeight;
        }

        public void setPostThumbnailHeight(Integer postThumbnailHeight) {
            this.postThumbnailHeight = postThumbnailHeight;
        }

        public String getTwentytwentyFullscreen() {
            return twentytwentyFullscreen;
        }

        public void setTwentytwentyFullscreen(String twentytwentyFullscreen) {
            this.twentytwentyFullscreen = twentytwentyFullscreen;
        }

        public Integer getTwentytwentyFullscreenWidth() {
            return twentytwentyFullscreenWidth;
        }

        public void setTwentytwentyFullscreenWidth(Integer twentytwentyFullscreenWidth) {
            this.twentytwentyFullscreenWidth = twentytwentyFullscreenWidth;
        }

        public Integer getTwentytwentyFullscreenHeight() {
            return twentytwentyFullscreenHeight;
        }

        public void setTwentytwentyFullscreenHeight(Integer twentytwentyFullscreenHeight) {
            this.twentytwentyFullscreenHeight = twentytwentyFullscreenHeight;
        }

    }

    public class SourceLogo {

        @SerializedName("ID")
        @Expose
        private Integer iD;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("filename")
        @Expose
        private String filename;
        @SerializedName("filesize")
        @Expose
        private Integer filesize;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("alt")
        @Expose
        private String alt;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("uploaded_to")
        @Expose
        private Integer uploadedTo;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("modified")
        @Expose
        private String modified;
        @SerializedName("menu_order")
        @Expose
        private Integer menuOrder;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("subtype")
        @Expose
        private String subtype;
        @SerializedName("icon")
        @Expose
        private String icon;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("sizes")
        @Expose
        private Sizes sizes;

        /**
         * No args constructor for use in serialization
         *
         */
        public SourceLogo() {
        }

        /**
         *
         * @param date
         * @param author
         * @param link
         * @param alt
         * @param icon
         * @param description
         * @param caption
         * @param filesize
         * @param mimeType
         * @param title
         * @param type
         * @param url
         * @param uploadedTo
         * @param menuOrder
         * @param filename
         * @param sizes
         * @param subtype
         * @param name
         * @param width
         * @param modified
         * @param iD
         * @param id
         * @param status
         * @param height
         */
        public SourceLogo(Integer iD, Integer id, String title, String filename, Integer filesize, String url, String link, String alt, String author, String description, String caption, String name, String status, Integer uploadedTo, String date, String modified, Integer menuOrder, String mimeType, String type, String subtype, String icon, Integer width, Integer height, Sizes sizes) {
            super();
            this.iD = iD;
            this.id = id;
            this.title = title;
            this.filename = filename;
            this.filesize = filesize;
            this.url = url;
            this.link = link;
            this.alt = alt;
            this.author = author;
            this.description = description;
            this.caption = caption;
            this.name = name;
            this.status = status;
            this.uploadedTo = uploadedTo;
            this.date = date;
            this.modified = modified;
            this.menuOrder = menuOrder;
            this.mimeType = mimeType;
            this.type = type;
            this.subtype = subtype;
            this.icon = icon;
            this.width = width;
            this.height = height;
            this.sizes = sizes;
        }

        public Integer getID() {
            return iD;
        }

        public void setID(Integer iD) {
            this.iD = iD;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public Integer getFilesize() {
            return filesize;
        }

        public void setFilesize(Integer filesize) {
            this.filesize = filesize;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getUploadedTo() {
            return uploadedTo;
        }

        public void setUploadedTo(Integer uploadedTo) {
            this.uploadedTo = uploadedTo;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public Integer getMenuOrder() {
            return menuOrder;
        }

        public void setMenuOrder(Integer menuOrder) {
            this.menuOrder = menuOrder;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Sizes getSizes() {
            return sizes;
        }

        public void setSizes(Sizes sizes) {
            this.sizes = sizes;
        }

    }

    public class Ad {

        @SerializedName("pid")
        @Expose
        private Integer pid;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("image")
        @Expose
        private String image;

        /**
         * No args constructor for use in serialization
         *
         */
        public Ad() {
        }

        /**
         *
         * @param image
         * @param link
         * @param description
         * @param pid
         * @param title
         */
        public Ad(Integer pid, String title, String description, String link, String image) {
            super();
            this.pid = pid;
            this.title = title;
            this.description = description;
            this.link = link;
            this.image = image;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }

    public class Banner {

        @SerializedName("pid")
        @Expose
        private Integer pid;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("image")
        @Expose
        private String image;

        /**
         * No args constructor for use in serialization
         *
         */
        public Banner() {
        }

        /**
         *
         * @param image
         * @param link
         * @param description
         * @param pid
         * @param title
         */
        public Banner(Integer pid, String title, String description, String link, String image) {
            super();
            this.pid = pid;
            this.title = title;
            this.description = description;
            this.link = link;
            this.image = image;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }

    public class CategoryBotton {

        @SerializedName("cid")
        @Expose
        private Integer cid;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("taxonomy")
        @Expose
        private Object taxonomy;
        @SerializedName("color")
        @Expose
        private String color;
        @SerializedName("image")
        @Expose
        private String image;

        public Integer getCid() {
            return cid;
        }

        public void setCid(Integer cid) {
            this.cid = cid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(Object taxonomy) {
            this.taxonomy = taxonomy;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }

}

