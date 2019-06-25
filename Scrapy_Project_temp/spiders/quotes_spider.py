import scrapy


class QuotesSpider(scrapy.Spider):

    name = "quotes"
    start_urls = [
        "http://www.lankadeepa.lk/politics/13",
        "http://www.lankadeepa.lk/world_news/14",
        "http://www.lankadeepa.lk/business/9",
        "http://www.lankadeepa.lk/feature/2",
        "http://www.lankadeepa.lk/top_story/10"

    ]

    def parse(self, response):
        allNews = response.css('header.post-content div.row div.simple-thumb')
        newsCategory = response.css('div.col-xs-18 div.header')
        for news in allNews:
            yield {
                'newsCategory':newsCategory.css('h4.catpost-category::text').get().encode("utf-8"),
                'newsTitle': news.css('a::attr(href)').get().encode("utf-8"),
                'newsTime': news.css('p.timeandauthor small::text').get().encode("utf-8"),
                'summary': news.css('p.catexcerpt::text').get().encode("utf-8")
            }

        next_page = response.css('div.page-nation ul.pagination li.next a::attr(href)').get()
        if next_page is not None:
            yield response.follow(next_page, callback=self.parse)