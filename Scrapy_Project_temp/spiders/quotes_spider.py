import scrapy


class QuotesSpider(scrapy.Spider):

    name = "quotes"
    start_urls = [
        "https://technews.lk/tag/technology/",
        "https://technews.lk/tag/google/",
        "https://technews.lk/tag/mobile/",
        "https://technews.lk/tag/apps-tag/",
        "https://technews.lk/tag/security/",
        "https://technews.lk/tag/business/",
        "https://technews.lk/tag/social-media/"




    ]

    def parse(self, response):
        allBlogs = response.css('main.site-main div.inner div.post-feed article.post-card')
        for blog in allBlogs:
            yield {
                'blogCategory':blog.css('div.post-card-content '
                                        'a.post-card-content-link '
                                        'header.post-card-header '
                                        'span.post-card-tags::text').get().encode("utf-8"),
                'blogTitle': blog.css('div.post-card-content '
                                      'a.post-card-content-link '
                                      'header.post-card-header '
                                      'h2.post-card-title::text').get().encode("utf-8"),
                'author': blog.css('div.post-card-content footer.post-card-meta ul.author-list li.author-list-item div.author-name-tooltip::text').get().encode("utf-8"),
                'summary': blog.css('div.post-card-content a.post-card-content-link header.post-card-header p.post-card-excerpt::text').get().encode("utf-8"),
                'blogDate': blog.css('div.post-card-content footer.post-card-meta span.reading-time::text').get().encode('utf-8')
            }

        # next_page = response.css('div.page-nation ul.pagination li.next a::attr(href)').get()
        # if next_page is not None:
        #     yield response.follow(next_page, callback=self.parse)