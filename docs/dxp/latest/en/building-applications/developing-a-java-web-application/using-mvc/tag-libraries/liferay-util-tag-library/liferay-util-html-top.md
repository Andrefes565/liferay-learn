# Using Liferay Util HTML Top

The HTML top tag is not a self-closing tag. The content placed between the opening and closing of this tag is moved to the `<head>` tag. When something is passed using this taglib, the [top_head.jsp](https://github.com/liferay/liferay-portal/blob/master/portal-web/docroot/html/common/themes/top_head.jsp#L147-L153) is passed markup and outputs in this JSP. 

This tag also has an optional `outputKey` attribute. If several portlets on the page include the same resource with this tag, you can specify the same `outputKey` value for each tag so the resource is only loaded once. 

The example configuration below uses the `<liferay-util:html-top>` tag to  include additional CSS styles provided by the portlet's bundle:

```jsp
<liferay-util:html-top outputKey="htmltop">
				<link data-senna-track="permanent" 
        href="/o/my-liferay-util-portlet/css/my-custom-styles.css" 
        rel="stylesheet" type="text/css" />
</liferay-util:html-top>
```

Now you know how to use the `<liferay-util:html-top>` tag to include additional resources in the top of the page's HTML tag. 

## Related Topics

* [Using the Liferay Util HTML Bottom Tag](./liferay-util-html-bottom.md)
* [Using the Liferay Util Body Top Tag](./liferay-util-body-top.md)
* [Using the Clay Taglib](../clay-tag-library.md)
