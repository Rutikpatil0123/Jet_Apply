package com.example.jetapply.model

data class Company(val companyName : String,
                   val nameOfCEO : String,
                   val companyFounder: String,
                   val year : String,
                   val companyLogo : String,
                   val careerPageLink : String,
                   val companyDomain: String,
                   val about: String,
                   val companyProducts : String,
                   val companyImages : List<String>
)

fun getCompany() : List<Company> {
    return listOf(

        Company(companyName = "Google",
            nameOfCEO = "Sundar Pichai",
            companyFounder = "Larry Page, Sergey Brin",
            year = "1996",
            about = "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics.",
            companyLogo = "https://53.fs1.hubspotusercontent-na1.net/hub/53/hubfs/image8-2.jpg?width=893&height=600&name=image8-2.jpg",
            careerPageLink = "https://careers.google.com/jobs/results/",
            companyDomain = "Artificial intelligence, Advertising, Cloud computing, Computer software, Computer hardware, Internet",
            companyProducts = "Workspace, Android, YouTube, Waze, Pixel, Nest, Full list",
            companyImages = listOf(
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftechmonitor.ai%2Fwhat-is%2Fwhat-is-google&psig=AOvVaw2flYt5VXn9680NSY-GCDWU&ust=1680847067677000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJDwmLXJlP4CFQAAAAAdAAAAABAE",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.investopedia.com%2Finvesting%2Fcompanies-owned-by-google%2F&psig=AOvVaw2flYt5VXn9680NSY-GCDWU&ust=1680847067677000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJDwmLXJlP4CFQAAAAAdAAAAABAW",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fs.yimg.com%2Fny%2Fapi%2Fres%2F1.2%2FZz.l_leFHwh_V_Ya2G5CTQ--%2FYXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-%2Fhttp%3A%2F%2Fo.aolcdn.com%2Fhss%2Fstorage%2Fmidas%2F55da3e5c7cec7dc41d413ffe3288f61e%2F200976599%2F192086159.jpg%26client%3Da1acac3e1b3290917d92%26signature%3Df3a6b2fc283698dcead25cb722704aec1e5a3bf4&tbnid=GZs6Z2Ml35meQM&vet=10CBQQxiAoA2oXChMIkPCYtcmU_gIVAAAAAB0AAAAAEBw..i&imgrefurl=https%3A%2F%2Fwww.engadget.com%2F2018-05-24-google-will-always-do-evil.html&docid=rmJYpxjjs_pc3M&w=1200&h=800&itg=1&q=Company%20google&ved=0CBQQxiAoA2oXChMIkPCYtcmU_gIVAAAAAB0AAAAAEBw",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcontentstatic.timesjobs.com%2Fimg%2F65099037%2FMaster.jpg&tbnid=D8e4xfDIRVQDnM&vet=12ahUKEwioxLK0yZT-AhW293MBHTZQCRwQMygtegUIARC9Ag..i&imgrefurl=https%3A%2F%2Fcontent.timesjobs.com%2F5-reasons-why-google-is-a-dream-company-of-every-candidate%2Farticleshow%2F65098932.cms&docid=NEJnKwmc2w2A-M&w=1200&h=766&q=Company%20google&ved=2ahUKEwioxLK0yZT-AhW293MBHTZQCRwQMygtegUIARC9Ag"
            )

        ),

        Company(companyName = "Meta",
            nameOfCEO = "Mark Zuckerberg",
            companyFounder = "Mark Zuckerberg, Eduardo Saverin, Andrew McCollum, Dustin Moskovitz, Chris Hughes",
            year = "2004",
            about = "Meta Platforms, Inc., doing business as Meta and formerly named Facebook, Inc., and TheFacebook, Inc., is an American multinational technology conglomerate based in Menlo Park, California. The company owns Facebook, Instagram, and WhatsApp, among other products and services. ",
            companyLogo = "https://1000logos.net/wp-content/uploads/2021/10/Meta-Logo.png",
            careerPageLink = "https://www.metacareers.com/jobs/",
            companyDomain = "Social media, Social network advertising, Consumer electronics, Virtual reality",
            companyProducts = "Facebook, Instagram,Messenger, WhatsApp, Meta Quest, Horizon Worlds, Mapillary, Workplace, Portal (discontinued),Diem (acquired)",
            companyImages = listOf(
                "https://etimg.etb2bimg.com/photo/95466806.cms",
                "https://blog.logomyway.com/wp-content/uploads/2021/11/meta-logo.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/b/bb/Meta_HQ_2023.png"
            )

        ),

        Company(companyName = "Netflix",
            nameOfCEO = "Ted Sarandos",
            companyFounder = "Reed Hastings, Marc Randolph",
            year = "1997 ",
            about = "Netflix, Inc. is an American media company based in Los Gatos, California. Founded in 1997 by Reed Hastings and Marc Randolph in Scotts Valley, California, it operates the over-the-top subscription video on-demand service Netflix brand, which includes original films and television series commissioned or acquired by the company, and third-party content licensed from other distributors. Netflix is a member of the Motion Picture Association—having become the first streaming company to become a member.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Netflix_2015_logo.svg/1920px-Netflix_2015_logo.svg.png",
            careerPageLink = "https://jobs.netflix.com/",
            companyDomain = "Streaming, mediaPay, television, Video on demand, Mobile gaming",
            companyProducts = "Fast.com (www.fast.com), DVD Netflix (dvd.netflix.com), Millarworld, LT-LA, Albuquerque Studios, Netflix Pictures, Netflix Studios, Netflix Animation, StoryBots, Inc., Grauman's Egyptian Theatre, Broke and Bones (stake), Roald Dahl Story Company, Night School Studio, Netflix Pty Ltd, Scanline VFX,Next Games, Boss Fight Entertainment, Animal Logic, Spry Fox",

            companyImages = listOf(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Netflix_Los_Angeles_office.jpg/800px-Netflix_Los_Angeles_office.jpg",
                "https://www.brandingmag.com/wp-content/uploads/2021/08/Thibaud_Clement_006_COVER.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/101_Albright_Way.jpg/315px-101_Albright_Way.jpg"
            )

        ),
        Company(
            companyName = "Apple",
            nameOfCEO = "Tim Cook",
            companyFounder = "Steve Jobs, Steve Wozniak, Ronald Wayne, Mike Markkula",
            year = "1976",
            about = "Apple Inc. is an American multinational technology company headquartered in Cupertino, California. Apple is the largest technology company by revenue, totaling US\$394.3 billion in 2022. As of March 2023, Apple is the world's biggest company by market capitalization.",
            companyLogo = "https://companieslogo.com/img/orig/AAPL-bf1a4314.png?t=1632720960",
            careerPageLink = "https://www.apple.com/careers/in/",
            companyDomain = "Consumer electronics, Software services, Online services",
            companyProducts = "Apple store, Apple card, Apple music, Apple pay, Mac, iPhone",
            companyImages = listOf(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Aerial_view_of_Apple_Park_dllu.jpg/375px-Aerial_view_of_Apple_Park_dllu.jpg",
                "https://www.ethicalconsumer.org/sites/default/files/styles/place/public/images/2018-05/company%20profile%20apple%20macbook.jpg?h=9e499333&itok=0Onx8qU3",
                "https://scx1.b-cdn.net/csz/news/800a/2018/financialfru.jpg"
            )

        ),

        Company(
            companyName = "Amazon",
            nameOfCEO = "Andy Jassy",
            companyFounder = "Jeff Bezos",
            year = "1994",
            about = "Amazon.com, Inc. is an American multinational technology company focusing on e-commerce, cloud computing, online advertising, digital streaming, and artificial intelligence.",
            companyLogo = "https://www.freepnglogos.com/uploads/amazon-png-logo-vector/woodland-gardening-amazon-png-logo-vector-8.png",
            careerPageLink = "https://www.amazon.jobs/en-gb",
            companyDomain = "Conglomerate",
            companyProducts = "Amazon.com, Amazon Alexa, Amazon Appstore, Amazon Luna, Amazon Music, Amazon Pay, Amazon Prime",
            companyImages = listOf(
                "https://st.adda247.com/https://wpassets.adda247.com/wp-content/uploads/multisite/sites/5/2022/11/16140212/L2aCmYvS-amazon1-1200x675-1.jpg",
                "https://contentstatic.techgig.com/thumb/msid-76976704,width-460,resizemode-4/Heres-how-to-apply-for-a-job-and-get-placed-at-Amazon-India.jpg?127601",
                "https://www.itp.net/cloud/2023/01/05/Amazon-1536x1080.jpeg"

            )
        ),

        Company(
            companyName = "Atlassian",
            nameOfCEO = "Mike Cannon-Brookes",
            companyFounder = "Mike Cannon-Brookes, Scott Farquhar",
            year = "2002",
            about = "Atlassian Corporation is an Australian software company that develops products for software developers, project managers and other software development teams. The company is domiciled in Delaware, with global headquarters in Sydney, Australia, and US headquarters in San Francisco.",
            companyLogo = "https://scontent.fbom45-1.fna.fbcdn.net/v/t1.6435-9/67151753_2558872980809646_2585223321784156160_n.png?_nc_cat=1&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=JBod0MyzRawAX_W4SU0&_nc_ht=scontent.fbom45-1.fna&oh=00_AfA4LfMeIguZ37BCX0lwwmn-aihplxJMO_rBBJne1V9bEg&oe=64567D49",
            careerPageLink = "",
            companyDomain = "Software",
            companyProducts =
            "Jira, Confluence, Hipchat/Stride ,Bitbucket/Bitbucket Server, Bamboo ,Fisheye, Crucible, Trello, Atlassian Marketplace, Sourcetree, Crowd, Statuspage, OpsGenie, Jira ,Align, Halp, Mindville",
            companyImages = listOf(
                "https://bl-i.thgim.com/public/info-tech/h9nad6/article28270392.ece/alternates/LANDSCAPE_1200/Atlassian-entrance",
                "https://images.moneycontrol.com/static-mcnews/2022/09/Atlassian-770x433.jpg?impolicy=website&width=770&height=431",
                "https://pilbox.themuse.com/image.jpg?url=https%3A%2F%2Fassets.themuse.com%2Fuploaded%2Fcompanies%2F741%2Fabout_modules%2F5168%2Ff675f656-28cd-499a-8feb-c858497ff0f2.jpg%3Fv%3D1dec61e1648e6d8d544a929d4af612e9532377b17925ee504087654bd531e35d&fmt=jpeg&h=800&mode=crop&pos=top&prog=1&q=90&w=1200"

            )
        ),

        Company(
            companyName = "Microsoft",
            nameOfCEO = "Satya Nadella",
            companyFounder = "Bill Gates, Paul Allen",
            year = "1975",
            about = "Microsoft Corporation is an American multinational technology corporation headquartered in Redmond, Washington. Microsoft's best-known software products are the Windows line of operating systems, the Microsoft Office suite, and the Internet Explorer and Edge web browsers.",
            companyLogo = "https://seekvectorlogo.com/wp-content/uploads/2017/12/microsoft-vector-logo-small.png",
            careerPageLink = "https://careers.microsoft.com/us/en",
            companyDomain = "Software development, Computer hardware, Consumer electronics, Social networking service, Cloud computing, Video games, Internet, Corporate venture capital",
            companyProducts = "Azure, Bing, LinkedIn, Yammer, Microsoft 365, OneDrive, Outlook.com, GitHub, Microsoft Store, Windows Update, Xbox Game Pass, Xbox network",
            companyImages = listOf(
                "https://images.mktw.net/im-745473?width=700&size=1.5005861664712778&pixel_ratio=1.5",
                "https://thebrandhopper.com/wp-content/uploads/2022/04/2794d2c77d792a07d6a57f8f5df00ea0.jpg",
                "https://www.technewsworld.com/wp-content/uploads/sites/3/2022/02/microsoft-redmond.jpg"

            )
        ),

        Company(
            companyName = "Paytm",
            nameOfCEO = "Vijay Shekhar Sharma",
            companyFounder = "Vijay Shekhar Sharma",
            year = "2010",
            about = "Paytm is an Indian multinational financial technology company, that specializes in digital payments and financial services, based in Noida. It was founded in 2010 by Vijay Shekhar Sharma under One97 Communications.",
            companyLogo = "https://1000logos.net/wp-content/uploads/2023/03/Paytm-logo.png",
            careerPageLink = "https://paytm.com/careers/",
            companyDomain = "Financial technology, E-commerce",
            companyProducts = "Paytm Insider, Paytm Payments, Bank,Paytm Money,PayPay,Paytm Insurance, Paytm First Games",
            companyImages = listOf(
                "https://cdn.zeebiz.com/sites/default/files/styles/zeebiz_850x478/public/2022/11/10/210011-paytm-1634926377.jpg?itok=0WyUEwoy&c=428059701fe98177386a42c2b03a97e0",
                "https://techstory.in/wp-content/uploads/2020/03/7de5125acb4525acd5e8ef09af39fdbd2814255.jpg",
                "https://cdn.zeebiz.com/sites/default/files/styles/zeebiz_850x478/public/2020/03/05/113358-paytm-reuters.jpg?itok=2ua0hR7q&c=c5af8c0f92ccc8e249257bf0f1cb18e8"
            )

        ),

        Company(
            companyName = "Tesla, Inc.",
            nameOfCEO = "Elon Musk",
            companyFounder = "Elon Musk, Martin Eberhard, Marc Tarpenning, JB Straubel, Ian Wright",
            year = "2003",
            about = "Tesla designs and manufactures electric vehicles, as well as energy storage systems, sfr panels, and related products. The company also provides maintenance and repair services.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Tesla_Motors.svg/109px-Tesla_Motors.svg.png",
            careerPageLink = "https://www.tesla.com/careers/search#/",
            companyDomain = "Electric vehicles",
            companyProducts = "Electric vehicles, Energy storage systems, Solar panels",
            companyImages = listOf(
                "https://www.google.com/search?q=tesla+images&rlz=1C5CHFA_enUS895US895&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi_3JfE7O3xAhURyDgGHUzOByQQ_AUIBigB&biw=1366&bih=657#imgrc=",
                "https://www.google.com/search?q=tesla+images&rlz=1C5CHFA_enUS895US895&tbm=isch&ved=0ahUKEwi_3JfE7O3xAhURyDgGHUzOByQQMygBegUIARDvAQ#imgrc=ayzBNYenYlj5aM"
            )
        ),

        Company(
            companyName = "Tencent Holdings Limited",
            nameOfCEO = "Ma Huateng",
            companyFounder = "Ma Huateng, Zhang Zhidong",
            year = "1998",
            about = "Tencent is a Chinese multinational conglomerate holding company that provides various Internet-related services and products. The company's businesses include social media, entertainment, gaming, and online payments.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Tencent_Logo.svg/220px-Tencent_Logo.svg.png",
            careerPageLink = "https://careers.tencent.com/en-us/home.html",
            companyDomain = "Entertainment",
            companyProducts = "Social media, Entertainment, Gaming, Online payments",
            companyImages = listOf(
                "https://www.google.com/search?q=tencent&rlz=1C5CHFA_enUS895US895&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiW6JG17O3xAhXCElgKHXK9B_sQ_AUIBygC&biw=1366&bih=657#imgrc=",
                "https://www.google.com/search?q=tencent&rlz=1C5CHFA_enUS895US895&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiW6JG17O3xAhXCElgKHXK9B_sQ_AUIBygC&biw=1366&bih=657#imgrc=MNytUh983iZMNM"
            )
        ),

        Company(
            companyName = "Alibaba Group Holding Limited",
            nameOfCEO = "Daniel Zhang",
            companyFounder = "Jack Ma",
            year = "1999",
            about = "Alibaba is a Chinese multinational conglomerate holding company that specializes in e-commerce, retail, Internet, and technology. The company also provides services like online payments, shopping search engines, and data-centric cloud computing services.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/8/80/Alibaba-Group-Logo.svg/220px-Alibaba-Group-Logo.svg.png",
            careerPageLink = "https://talent.alibaba.com/?lang=zh",
            companyDomain = "E-commerce",
            companyProducts = "E-commerce, Retail, Internet, Technology",
            companyImages = listOf(
                "https://www.google.com/search?q=alibaba&rlz=1C5CHFA_enUS895"
            )
        ),
        Company(
            companyName = "Mastercard Incorporated",
            nameOfCEO = "Michael Miebach",
            companyFounder = "United California Bank, Wells Fargo Bank, Crocker National Bank, and the Bank of California",
            year = "1966",
            about = "Mastercard is a multinational financial services corporation that operates the world's fastest payments processing network, connecting consumers, financial institutions, merchants, governments, and businesses in more than 210 countries and territories. The company's products and solutions empower businesses and consumers to make transactions securely and seamlessly. Mastercard is committed to innovation and driving economic growth, providing its customers with the technology necessary to thrive in today's rapidly-evolving digital economy.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Mastercard_2019_logo.svg/200px-Mastercard_2019_logo.svg.png",
            careerPageLink = "https://www.mastercard.us/en-us/about-mastercard/careers.html",
            companyDomain = "FinTech",
            companyProducts = "Credit cards, debit cards, prepaid cards, payment processing solutions, data and analytics services",
            companyImages = listOf(
                "https://www.mastercard.us/content/dam/mccom/global/about-mastercard/careers-masthead-580x128.jpg.image.1440.full.jpg, https://www.mastercard.us/content/dam/mccom/global/about-mastercard/mastercard-mobile-1020-510.jpg.image.1440.full.jpg"
            )
        ),

        Company(
            companyName = "Intel Corporation",
            nameOfCEO = "Patrick Gelsinger",
            companyFounder = "Robert Noyce and Gordon Moore",
            year = "1968",
            about = "Intel Corporation is a multinational technology company that is best known for designing and manufacturing microprocessors, integrated circuits, and other computer hardware. Intel's processors are used in a variety of devices, including personal computers, data centers, and the Internet of Things. The company is committed to driving innovation in the tech industry and investing in the development of cutting-edge technologies that will shape the future of computing.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Intel_logo_2023.svg/200px-Intel_logo_2023.svg.png",
            careerPageLink = "https://jobs.intel.com/",
            companyDomain = "computer hardware",
            companyProducts = "Processors, microprocessors, computer hardware, data center solutions, Internet of Things technology, artificial intelligence",
            companyImages = listOf("https://www.intel.ca/content/dam/www/public/us/en/2021-q2-investment/hero/Intel-Q2-investors-hero-new.png, https://www.intel.com/content/dam/www/public/us/en/images/overview/social-media.jpg"
            )
        ),

        Company(
            companyName = "Visa Inc.",
            nameOfCEO = "Alfred F. Kelly, Jr.",
            companyFounder = "Dee Hock",
            year = "1958",
            about = "Visa Inc. is a global financial services company that operates the world’s largest retail electronic payments network. Visa provides secure and convenient payment options for consumers, merchants, and businesses around the world. The company is dedicated to advancing the financial health of individuals and businesses, promoting financial inclusion, and leveraging its network and products to support economic growth and development.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Visa_2021.svg/220px-Visa_2021.svg.png",
            careerPageLink = "https://usa.visa.com/careers.html",
            companyDomain = "Fintech",
            companyProducts = "Credit cards, debit cards, prepaid cards, payment processing solutions, data analytics services",
            companyImages = listOf("https://usa.visa.com/dam/VCOM/regional/ap/images/common/homepage/hero-elite-athlete-tokyo-hub.jpg.zoom.768.jpg, https://usa.vis"
            )
        ),

        Company(
            companyName = "Salesforce.com, Inc.",
            nameOfCEO = "Marc Benioff",
            companyFounder = "Marc Benioff and Parker Harris",
            year = "1999",
            about = "Salesforce.com, Inc. is an American cloud-based software company. It is known for providing software for customer service, sales, and marketing automation. Salesforce has its headquarters in California, USA.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Salesforce.com_logo.svg/220px-Salesforce.com_logo.svg.png",
            careerPageLink = "https://www.salesforce.com/company/careers/",
            companyDomain = "https://www.salesforce.com/",
            companyProducts = "Salesforce Customer 360, Marketing, Cloud, Commerce Cloud, Service Cloud",
            companyImages = listOf(
                "https://www.salesforce.com/content/dam/blogs/ca/Blog%20Posts/salesforce-logo-1.jpg",
                "https://www.salesforce.com/content/dam/web/en_us/www/images/marketing-cloud/content-blocks/email-marketing.svg",
                "https://www.salesforce.com/content/dam/en-us/clouds/service-cloud/desktop-tour-service-cloud-desk-temp-1.webp"
            )
        ),

        Company(
            companyName = "PayPal Holdings, Inc",
            nameOfCEO = "Dan Schulman",
            companyFounder = "Max Levchin, Peter Thiel, and Elon Musk",
            year = "1998",
            about = "PayPal Holdings, Inc. is an American company that operates a worldwide online payments system. It is known for offering a digital way to send and receive money using the internet. PayPal has its headquarters in California, USA.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/PayPal.svg/220px-PayPal.svg.png",
            careerPageLink = "https://www.paypal.com/us/webapps/mpp/jobs/",
            companyDomain = "https://www.paypal.com/",
            companyProducts = "PayPal, Venmo, Braintree, Xoom",
            companyImages = listOf(
                "http://www.paypalobjects.com/digitalassets/c/website/home/header/hero-banner_brand.png",
                "https://www.paypalobjects.com/digitalassets/c/website/marketing/apac/rupee-images/faster-transfers.jpg",
                "https://www.paypalobjects.com/digitalassets/c/website/marketing/apac/rupee-images/open-new-doors.jpg"
            )
        ),
        Company(
            companyName = "Cisco Systems, Inc.",
            nameOfCEO = "Chuck Robbins",
            companyFounder = "Leonard Bosack and Sandy Lerner",
            year = "1984",
            about = "Cisco Systems, Inc. is an American multinational technology conglomerate that develops, manufactures and sells networking hardware, telecommunications equipment and other high-technology services and products. ",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Cisco_logo_blue_2016.svg/220px-Cisco_logo_blue_2016.svg.png",
            careerPageLink = "https://www.cisco.com/c/en/us/about/careers.html",
            companyDomain = "https://www.cisco.com",
            companyProducts = "Networking hardware, telecommunications equipment, and high-technology services",
            companyImages = listOf()
        ),

        Company(
            companyName = "Taiwan Semiconductor Manufacturing Company Limited",
            nameOfCEO = "Dr. C.C. Wei",
            companyFounder = "Morris Chang",
            year = "1981",
            about = "Taiwan Semiconductor Manufacturing Company Limited is a Taiwanese multinational semiconductor contract manufacturing and design company. It is the world’s largest dedicated independent semiconductor foundry.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/6/63/Tsmc.svg/200px-Tsmc.svg.png",
            careerPageLink = "https://www.tsmc.com/static/english/careers/index.htm",
            companyDomain = "https://www.tsmc.com",
            companyProducts = "Semiconductor design",
            companyImages = listOf()
        ),

        Company(
            companyName = "ASML Holding N.V.",
            nameOfCEO = "Peter Wennink",
            companyFounder = "",
            year = "1984",
            about = "ASML Holding N.V. is a Dutch multinational company and currently the largest supplier of photolithography systems used in the semiconductor industry. Their machines are used by the world's leading chip-making companies to produce integrated circuits or microchips.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/6/6c/ASML_Holding_N.V._logo.svg/200px-ASML_Holding_N.V._logo.svg.png",
            careerPageLink = "https://www.asml.com/en/careers",
            companyDomain = "https://www.asml.com/en",
            companyProducts = "Photolithography systems",
            companyImages = listOf()
        ),


        Company(
            companyName = "Samsung Electronics Co., Ltd.",
            nameOfCEO = "Kim Ki-nam",
            companyFounder = "Lee Byung-chul",
            year = "1969",
            about = "Samsung Electronics Co., Ltd. is a South Korean multinational electronics company that manufactures a wide range of consumer and industrial electronic products, including smartphones, televisions, refrigerators, monitors, and printers. It is the largest South Korean chaebol (business conglomerate).",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Samsung_wordmark.svg/220px-Samsung_wordmark.svg.png",
            careerPageLink = "https://www.samsung.com/us/careers/",
            companyDomain = "https://www.samsung.com/us/",
            companyProducts = "Consumer and industrial electronic products",
            companyImages = listOf()
        ),

        Company(
            companyName = "Oracle Corporation",
            nameOfCEO = "Safra Catz",
            companyFounder = "Larry Ellison, Bob Miner, and Ed Oates",
            year = "1977",
            about = "Oracle Corporation is an American multinational computer technology corporation headquartered in Austin, Texas. The company specializes in cloud computing, database management systems, and enterprise software products. Oracle is one of the largest software makers by revenue, and the largest database management systems provider in the world. The company has over 135,000 employees and operates in more than 175 countries.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Oracle_logo.svg/1920px-Oracle_logo.svg.png",
            careerPageLink = "https://www.oracle.com/corporate/careers/",
            companyDomain = "https://www.oracle.com/",
            companyProducts = "Oracle Cloud, Oracle Database, Oracle Fusion Middleware, Oracle Applications, Oracle Java",
            companyImages = listOf(
                "https://www.oracle.com/a/ocom/img/corporate/oracle-social-img.jpg",
                "https://www.globenewswire.com/content/dam/external/true/optimize/Oracle.jpg"
            )
        ),

        Company(
            companyName = "The Procter & Gamble Company",
            nameOfCEO = "David S. Taylor",
            companyFounder = "William Procter and James Gamble",
            year = "1837",
            about = "The Procter & Gamble Company is an American multinational consumer goods corporation headquartered in Cincinnati, Ohio. The company specializes in a wide range of consumer and personal care products, including beauty and grooming products, healthcare products, and household products. Procter & Gamble is one of the largest consumer goods companies in the world, with over 92,000 employees and operations in more than 70 countries.",
            companyLogo = "https://seeklogo.com/images/P/p-g-logo-F88374D76C-seeklogo.com.png",
            careerPageLink = "https://www.pgcareers.com/",
            companyDomain = "https://us.pg.com/",
            companyProducts = "Pampers, Tide, Crest, Oral-B, Gillette, Olay, Head & Shoulders",
            companyImages = listOf(
                "https://www.pg.com/images/footer/bottom-bg.png",
                "https://www.pg.com/images/2321x822_pg_mark_t.svg"
            )
        ),

        Company(

            companyName = "Accenture plc",
            nameOfCEO = "Julie Sweet",
            companyFounder = "",
            year = "1989",
            about = "Accenture is a multinational professional services company that provides consulting, technology, and outsourcing services. The company is headquartered in Dublin, Ireland, and has more than 537,000 employees serving clients in over 120 countries. Accenture is one of the largest consulting firms in the world, offering services in strategy, consulting, digital, technology, and operations.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Accenture.svg/220px-Accenture.svg.png",
            careerPageLink = "https://www.accenture.com/us-en/careers/jobsearch?jk=&sb=1&vw=0&is_rj=0&pg=1",
            companyDomain = "https://www.accenture.com/",
            companyProducts = "Consulting, Technology, Digital, Strategy, Operations",
            companyImages = listOf(
                "https://www.accenture.com/t20210623T112539Z__w__/us-en/_acnmedia/Accenture/Dev/Redesign-Assets/Purpose/header-887x544.png",
                "https://www.accenture.com/t20210622T065508Z__w__/us-en/_acnmedia/Accenture/Dev/Redesign-Assets/Themes/Careers/9_-_9.jpg"
            )
        ),

        Company(
            companyName = "IBM Corporation",
            nameOfCEO = "Arvind Krishna",
            companyFounder = "Charles Ranlett Flint",
            year = "1911",
            about = "IBM is a multinational technology company that manufactures and sells computer hardware, middleware, and software, as well as provides hosting and consulting services. It is one of the largest technology companies in the world and has a history of innovation in fields such as mainframe computing, artificial intelligence, and cloud computing.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/150px-IBM_logo.svg.png",
            careerPageLink = "https://www.ibm.com/employment/",
            companyDomain = "www.ibm.com",
            companyProducts = "IBM offers a range of products and services in areas such as AI, hybrid cloud, security, blockchain, and more.",
            companyImages = listOf(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/1200px-IBM_logo.svg.png",
                "https://www.ibm.com/images/portal/U1700267G71772D50Y38/Ibm-careers.jpg"
            )
        ),

        Company(

            companyName = "Broadcom Inc.",
            nameOfCEO = "Hock Tan",
            companyFounder = "Henry Nicholas and Henry Samueli",
            year = "1961",
            about = "Broadcom Inc. is a global technology company that designs, develops, and supplies semiconductor and infrastructure software solutions. Its products are used in a wide range of applications, including data centers, networking, storage, and mobile devices.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Broadcom_Ltd_Logo.svg/220px-Broadcom_Ltd_Logo.svg.png",
            careerPageLink = "https://www.broadcom.com/company/careers",
            companyDomain = "www.broadcom.com",
            companyProducts = "Broadcom offers a range of products in areas such as semiconductors, infrastructure software, and security.",
            companyImages = listOf(
                "https://www.broadcom.com/dist/assets/images/broadcom_og_image.png",
                "https://d1.awsstatic.com/partner-network/QuickStart/datasheets/broadcom_dell-emc_bnx2x_cna_ds_4th-Revision_AWS.76be9daaab1e78b31ba5d8dcd0d789db35ef70c7.png"
            )
        ),

        Company(
            companyName = "Baidu, Inc.",
            nameOfCEO = "Robin Li",
            companyFounder = "Robin Li and Eric Xu",
            year = "2000",
            about = "Baidu, Inc. is a Chinese multinational technology company that specializes in Internet-related services and products, including search engines, online advertising, and autonomous vehicles. It is one of the largest AI and internet companies in the world.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Baidu.svg/220px-Baidu.svg.png",
            careerPageLink = "https://talent.baidu.com/external/baidu/index.html#/index",
            companyDomain = "www.baidu.com",
            companyProducts = "Baidu offers a range of products and services, including search engines, maps, mobile apps, cloud services, and more.",
            companyImages = listOf(
                "https://www.btime.com/data/cxjc/2021-02-19/1613705962_802661.jpg",
                "https://d.newsweek.com/en/full/1572237/baidu.jpg"
            )
        ),

        Company(
            companyName = "Dell Technologies Inc.",
            nameOfCEO = "Michael Dell",
            companyFounder = "Michael Dell",
            year = "1984",
            about = "Dell Technologies Inc. is a multinational technology company that designs, develops, and sells computer hardware, software, and related services. It is one of the largest technology companies in the world and has a strong presence in areas such as personal computing, servers, and storage.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Dell_logo_2016.svg/150px-Dell_logo_2016.svg.png",
            careerPageLink = "https://jobs.dell.com/",
            companyDomain = "www.delltechnologies.com",
            companyProducts = "Dell offers a range of products and services in areas such as personal computing, servers, storage, and more. It also provides consulting and support services.",
            companyImages = listOf(
                "https://www.crn.com/resources/015-037Dell-Technologies-Logo.jpg",
                "https://cdn.mos.cms.futurecdn.net/U8JcqWwYnzTeKisREDbfyb.jpg"
            )
        ),

        Company(
            companyName = "Comcast Corporation",
            nameOfCEO = "Brian L. Roberts",
            companyFounder = "Ralph J. Roberts, Daniel Aaron, and Julian A. Brodsky",
            year = "1963",
            about = "Comcast Corporation is a global media and technology company founded in 1963. It is the second-largest broadcasting and cable television company in the world by revenue and one of the largest home Internet service providers in the United States. Comcast's headquarters are located in Philadelphia, Pennsylvania.",
            companyLogo = "https://static.seekingalpha.com/uploads/2019/4/3/9028031-1554342583088709_origin.png",
            careerPageLink = "https://corporate.comcast.com/careers",
            companyDomain = "https://corporate.comcast.com/",
            companyProducts = "Cable television, broadband Internet, VoIP phone, home security, network TV programming",
            companyImages = listOf(
                "https://www.xfinity.com/mobile/wp-content/uploads/2018/07/Why_Xfinity_Mobile_hero-image-resized-635x382.jpg",
                "https://www.nbc.com/sites/nbcunbc/files/2020/06/17/club-xy-1-d.jpg"
            )
        ),

        Company(
            companyName = "Zoom Video Communications, Inc.",
            nameOfCEO = "Eric S. Yuan",
            companyFounder = "Eric S. Yuan",
            year = "2011",
            about = "Zoom is a software company that provides a cloud-based video conferencing platform. Founded in 2011, Zoom's headquarters are based in San Jose, California. The company became a household name during the COVID-19 pandemic with people around the world relying on its video conferencing software to work, learn, and socialize remotely.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Zoom_Logo_2022.svg/120px-Zoom_Logo_2022.svg.png",
            careerPageLink = "https://zoom.wd5.myworkdayjobs.com/Zoom",
            companyDomain = "https://www.zoom.us/",
            companyProducts = "Cloud-based video conferencing, web conferencing, software-based video communications",
            companyImages = listOf(
                "https://www.helpnetsecurity.com/wp-content/uploads/2020/04/zoom-screenshot.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8G5W4w-SJ6QOkU_4vUxklBIUJEcKjFQYV-Q&usqp=CAU"
            )
        ),

        Company(
            companyName = "Square, Inc.",
            nameOfCEO = "Jack Dorsey",
            companyFounder = "Jack Dorsey and Jim McKelvey",
            year = "2009",
            about = "Square is a financial services and mobile payment company. It was founded in 2009, and its headquarters are located in San Francisco, California. The company offers a wide range of products and services to help businesses process payments and manage their finances, including its flagship Square Reader, which allows businesses to accept credit card payments on their smart devices.",
            companyLogo = "https://squareup.com/favicon.ico",
            careerPageLink = "https://squareup.com/careers",
            companyDomain = "https://squareup.com/",
            companyProducts = "Mobile payments, financial services, Square Reader",
            companyImages = listOf(
                "https://squareup.com/content/dam/squareup/images/brand-assets/symbol/Symbol_256.png",
                "https://venturebeat.com/wp-content/uploads/2018/03/george-floyd-counterfeit-donation-sites.jpg"
            )
        ),

        Company(
            companyName = "Shopify Inc.",
            nameOfCEO = "Tobias Lütke",
            companyFounder = "Tobias Lütke, Daniel Weinand, and Scott Lake",
            year = "2006",
            about = "Shopify is a Canadian e-commerce company that provides a platform for online stores and retail point-of-sale systems. Founded in 2006, Shopify's headquarters are located in Ottawa, Ontario. The platform allows businesses to create and customize their online stores, manage inventory, process payments, and more.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Shopify_logo_2018.svg/1920px-Shopify_logo_2018.svg.png",
            careerPageLink = "https://www.shopify.com/careers",
            companyDomain = "https://www.shopify.com/",
            companyProducts = "E-commerce platform, point-of-sale systems",
            companyImages = listOf(
                "https://lh3.googleusercontent.com/proxy/VbbBfKLmJ7VdLvjZUM0bDKlHelsc1nvqbJrmcB2z9R9Y2QASJ-wnTftSnK-bTXlVp-CJUXuc3DdSuIKfw81ShjYV_pbgFZaM1VjKPl578uFr7AkrGF1iBUw",
                "https://cdn.zappy.app/d9b6fed353b6f4dd8144f2d4b6075e5c.png"
            )
        ),

        Company(
            companyName = "Zscaler, Inc.",
            nameOfCEO = "Jay Chaudhry",
            companyFounder = "Jay Chaudhry",
            year = "2008",
            about = "Zscaler is a cloud-based information security company that offers security solutions for all devices and users in the enterprise. Their services include cloud-delivered firewall, web security, data protection and application security.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/f/fa/Zscaler_logo.svg/220px-Zscaler_logo.svg.png",
            careerPageLink = "https://www.zscaler.com/careers",
            companyDomain = "https://www.zscaler.com/",
            companyProducts = "Zscaler Internet Access, Zscaler Private Access, Zscaler Insights",
            companyImages = listOf(
                "https://www.zscaler.com/hubfs/homepage-hero-banner-9.png",
                "https://www.zscaler.com/hubfs/Zscura/Web/Engineering-at-Zscaler/760_340_Engineering-Background.jpg"
            )
        ),


        Company(
            companyName = "Qorvo, Inc.",
            nameOfCEO = "Bob Bruggeworth",
            companyFounder = "Qorvo was created by the merger of RF Micro Devices and TriQuint Semiconductor in 2015.",
            year = "2015",
            about = "Qorvo is a semiconductor company that designs and sells radio-frequency systems for a variety of products in the wireless communications and defense markets.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Qorvo_logo_black.png/220px-Qorvo_logo_black.png",
            careerPageLink = "https://www.qorvo.com/careers",
            companyDomain = "https://www.qorvo.com/",
            companyProducts = "Integrated Circuits, Amplifiers, Antennas, Filters, Switches",
            companyImages = listOf(
                "https://www.qorvo.com/themes/custom/qorvo/img/homepage/2018-12/Qorvo-Hero-Slide.jpg",
                "https://www.qorvo.com/themes/custom/qorvo/img/homepage/2019-11/Featured-Blog-Banner-Hero.jpg"
            )
        ),

        Company(

            companyName = "Trellix",
            nameOfCEO = "Kevin Mandia",
            companyFounder = "Ashar Aziz",
            year = "2004",
            about = "Trellix is a cybersecurity company that provides products and services to protect against advanced cyber threats.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Trellix_Logo.svg/220px-Trellix_Logo.svg.png",
            careerPageLink = "https://careers.trellix.com/",
            companyDomain = "Computer security",
            companyProducts = "Cyber Security Hardware and Software, Email Security, Endpoint Security, File Security, Cross Vendor Management Interface",
            companyImages = listOf(
                "(insert file path or URL here)",
                "(insert file path or URL here)"
            ) ),
        Company(


            companyName = "SailPoint Technologies Holdings, Inc.",
            nameOfCEO = "Mark McClain",
            companyFounder = "Mark McClain and Kevin Cunningham",
            year = "2005",
            about = "SailPoint Technologies Holdings, Inc. is a software company that provides identity and access management solutions for enterprises.",
            companyLogo = "https://mms.businesswire.com/media/20220816005872/en/1546154/2/SailPoint-Logo-RGB-Color_%282%29.jpg",
            careerPageLink = "https://www.sailpoint.com/company/careers/",
            companyDomain = "www.sailpoint.com",
            companyProducts = "IdentityIQ, IdentityNow, SecurityIQ, IdentityAI",
            companyImages = listOf(
                "(insert file path or URL here)",
                "(insert file path or URL here)"
            ) ),
        Company(

            companyName = "Fiverr International Ltd.",
            nameOfCEO = "Micha Kaufman",
            companyFounder = "Micha Kaufman and Shai Wininger",
            year = "2010",
            about = "Fiverr International Ltd. is an online marketplace for freelance services, offering a platform for businesses to find and hire skilled freelancers for their projects.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Fiverr_Logo_09.2020.svg/220px-Fiverr_Logo_09.2020.svg.png",
            careerPageLink = "https://www.fiverr.com/careers",
            companyDomain = "www.fiverr.com",
            companyProducts = "Fiverr Business, Fiverr Pro, Fiverr Learn",
            companyImages = listOf(
                "(insert file path or URL here)",
                "(insert file path or URL here)"
            ) ),
        Company(

            companyName = "HubSpot, Inc.",
            nameOfCEO = "Brian Halligan",
            companyFounder = "Brian Halligan and Dharmesh Shah",
            year = "2006",
            about = "HubSpot, Inc. is a software company that provides a platform for inbound marketing, sales, and customer service.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/HubSpot_Logo.svg/220px-HubSpot_Logo.svg.png",
            careerPageLink = "https://www.hubspot.com/careers/",
            companyDomain = "www.hubspot.com",
            companyProducts = "HubSpot Marketing Hub, HubSpot Sales Hub, HubSpot Service Hub, HubSpot CRM",
            companyImages = listOf(
                "(insert file path or URL here)",
                "(insert file path or URL here)"
            ) ),
        Company(
            companyName = "Unity Software Inc.",
            nameOfCEO = "John Riccitiello",
            companyFounder = "David Helgason, Nicholas Francis, Joachim Ante",
            year = "2004",
            about = "Unity Software Inc. is a leading provider of 3D content creation and game development software. It offers a wide range of tools and services for game developers, filmmakers, and other creative professionals. Its products are used by over 1.5 million developers worldwide.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Unity_2021.svg/220px-Unity_2021.svg.png",
            careerPageLink = "https://careers.unity.com/",
            companyDomain = "unity.com",
            companyProducts = "Unity Engine, Unity Analytics, Unity Ads, Unity Collaborate",
            companyImages = listOf(
                "https://images.unsplash.com/photo-1610642713978-44107a7b135f",
                "https://images.unsplash.com/photo-1518417031487-b6e55a4d92b8",
                "https://images.unsplash.com/photo-1569364784768-028d13aba1c3"
            ) ),

        Company(

            companyName = "Zillow Group, Inc.",
            nameOfCEO = "Rich Barton",
            companyFounder = "Rich Barton, Lloyd Frink",
            year = "2006",
            about = "Zillow Group, Inc. is a leading real estate and rental marketplace dedicated to empowering consumers with data, inspiration and knowledge around the place they call home. It serves the full lifecycle of owning and living in a home: buying, selling, renting, financing, remodeling and more.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Zillow_logo.svg/250px-Zillow_logo.svg.png",
            careerPageLink = "https://www.zillowgroup.com/careers/",
            companyDomain = "zillowgroup.com",
            companyProducts = "Zillow, Trulia, StreetEasy, Out East, HomeLight, Mortech",
            companyImages = listOf(
                "https://images.unsplash.com/photo-1548694905-e38d7f3cfcbd",
                "https://images.unsplash.com/photo-1580946610519-f729a0f89b66",
                "https://images.unsplash.com/photo-1499255223336-1a702fce48aa"
            ) ),
        Company(

            companyName = "Pegasystems Inc.",
            nameOfCEO = "Alan Trefler",
            companyFounder = "Alan Trefler",
            year = "1983",
            about = "Pegasystems Inc. is a leading enterprise software company that provides customer engagement and operational excellence solutions. Its software is designed to simplify complex business processes and transform customer experiences. It serves a wide range of industries, including financial services, healthcare, and government.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/0/0a/Pegasystems_logo.svg/230px-Pegasystems_logo.svg.png",
            careerPageLink = "https://www.pega.com/about/careers",
            companyDomain = "pega.com",
            companyProducts = "Pega Platform, Pega CRM, Pega Customer Service, Pega Marketing, Pega RPA",
            companyImages = listOf(
                "https://images.unsplash.com/photo-1523363493557-9e9e714bdd95",
                "https://images.unsplash.com/photo-1532583264113-3f53e7d7fb9c",
                "https://images.unsplash.com/photo-1565379201063-edc159761414"
            ) ),
        Company(
            companyName = "iRobot Corporation",
            nameOfCEO = "Colin Angle",
            companyFounder = "Colin Angle, Helen Greiner, and Rodney Brooks",
            year = "1990",
            about = "iRobot Corporation is an American advanced technology company specialized in developing robots for industrial, military, and domestic applications. The company offers a range of home cleaning robots that include robotic vacuums, mops, and pool cleaners.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/IRobot_Green_logo.png/220px-IRobot_Green_logo.png",
            careerPageLink = "https://careers.irobot.com/",
            companyDomain = "https://www.irobot.com/",
            companyProducts = "Roomba, Braava, Mirra",
            companyImages = listOf(
                "https://www.irobot.com/content/dam/irobot/home-page/hero/072321_i7_nav_cleaner_hero_desktop.jpg",
                "https://www.irobot.com/content/dam/irobot/home-page/hero/braava-m6-kitchen-desktop.jpg",
                "https://www.irobot.com/content/dam/irobot/home-page/hero/mirra-dark-kid-swimming-tank-hard-testing-hero-desktop.jpg"
            ) ),
        Company(

            companyName = "Alteryx, Inc.",
            nameOfCEO = "Mark Anderson",
            companyFounder = "Dean Stoecker and Olivia Duane Adams",
            year = "1997",
            about = "Alteryx is a data science and analytics company that offers a platform for data preparation, blending, and analysis. The company's products allow organizations to connect and analyze data from various sources, as well as create workflows and predictive models for business decisions.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Alteryx_logo.svg/220px-Alteryx_logo.svg.png",
            careerPageLink = "https://www.alteryx.com/about-us/careers",
            companyDomain = "https://www.alteryx.com/",
            companyProducts = "Alteryx Designer, Alteryx Server",
            companyImages = listOf(
                "https://www.alteryx.com/sites/default/files/styles/hero_desktop/public/2021-07/promoted_analytics_0.png?itok=0LPVgI3T",
                "https://www.alteryx.com/sites/default/files/styles/hero_desktop/public/2021-01/12.8-InnovationEligible_01.jpg?itok=FFCYJLk-"
            ) ),
        Company(

            companyName = "ANSYS, Inc.",
            nameOfCEO = "Ajay Agrawal",
            companyFounder = "John Swanson",
            year = "1970",
            about = "ANSYS is an American engineering simulation software company that offers software and services to engineers, designers, and manufacturers. The company's platform enables users to simulate the performance of their products and optimize their designs before they are built.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Ansys_logo_%282019%29.svg/220px-Ansys_logo_%282019%29.svg.png",
            careerPageLink = "https://www.ansys.com/about-ansys/careers",
            companyDomain = "https://www.ansys.com/",
            companyProducts = "ANSYS Mechanical, ANSYS Fluent, ANSYS HFSS",
            companyImages = listOf(
                "https://www.ansys.com/-/media/ansys/corporate/home/featured-product/fluent.png",
                "https://www.ansys.com/-/media/ansys/corporate/home/featured-product/ansys-mechanical.png",
                "https://www.ansys.com/-/media/ansys/corporate/home/featured-product/ansys-hfss.png"
            ) ),

        Company(
            companyName = "Activision Blizzard, Inc.",
            nameOfCEO = "Robert Kotick",
            companyFounder = "David Crane, Alan Miller, Bob Whitehead",
            year = "2008",
            about = "Activision Blizzard, Inc. is an American video game holding company based in Santa Monica, California. The company was formed in 2008 by the merger of Activision with Vivendi Games under the leadership of President and CEO Bobby Kotick.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Activision.svg/220px-Activision.svg.png",
            careerPageLink = "https://careers.activisionblizzard.com/",
            companyDomain = "https://www.activisionblizzard.com/",
            companyProducts = "Video games, including popular franchises such as Call of Duty, Warcraft, Diablo, and Overwatch.",
            companyImages = listOf(
                "https://www.activisionblizzard.com/_img/heroes/game-cod.webp",
                "https://www.activisionblizzard.com/_img/heroes/map-modernwarfare.webp",
                "https://www.activisionblizzard.com/_img/heroes/mccree-overwatch.webp"
            ) ),
        Company(
            companyName = "Spotify Technology S.A.",
            nameOfCEO = "Daniel Ek",
            companyFounder = "Daniel Ek, Martin Lorentzon",
            year = "2006",
            about = "Spotify Technology S.A. is a Swedish music streaming and media services provider. It was founded in 2006 in Stockholm, Sweden, and operates internationally.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Spotify_logo_with_text.svg/220px-Spotify_logo_with_text.svg.png",
            careerPageLink = "https://www.spotifyjobs.com/",
            companyDomain = "https://www.spotify.com/",
            companyProducts = "Music streaming and podcast services.",
            companyImages = listOf(
                "https://www.gstatic.com/android/market_images/web/play_prism_hlock_2x.png",
                "https://miro.medium.com/max/5040/1*scWQE-xGkeR1ZOyAKn7xvA.png",
                "https://blog.cambridgecoaching.com/hs-fs/hubfs/spotify-mobile-app-1584556-bw-hmb-722063-unsplash.jpg?width=1024&name=spotify-mobile-app-1584556-bw-hmb-722063-unsplash.jpg"
            ) ),
        Company(
            companyName = "Twitter, Inc.",
            nameOfCEO = "Jack Dorsey",
            companyFounder = "Jack Dorsey, Biz Stone, Evan Williams",
            year = "2006",
            about = "Twitter, Inc. is an American social media company based in San Francisco, California. It was founded in 2006 and operates internationally.",
            companyLogo = "https://logos-world.net/wp-content/uploads/2020/04/Twitter-Logo.png",
            careerPageLink = "https://careers.twitter.com/en.html",
            companyDomain = "https://twitter.com/",
            companyProducts = "Social networking and microblogging service used to share information and socialize with others.",
            companyImages = listOf(
                "https://techcrunch.com/wp-content/uploads/2016/04/twitter-live-feed.jpg?w=730&crop=1",
                "https://cdn.vox-cdn.com/thumbor/d4mFaiJDgjX9daBnZcPxDU6umYU=/0x0:2040x1360/1536x1024/filters:focal(862x518:1178x834):no_upscale()/cdn.vox-cdn.com/uploads/chorus_image/image/62858207/acastro_180703_1777_twitter_0005.0.jpg",
                "https://techmoran.com/wp-content/uploads/2017/08/2016-Twitter-logo-and-icons.png"
            ) ),

        Company(
            companyName = "DocuSign",
            nameOfCEO = "Dan Springer",
            companyFounder = "Court Lorenzini",
            year = "2003",
            about = "DocuSign is a San Francisco-based company that provides electronic signature technology and digital transaction management services for facilitating electronic exchanges of contracts and signed documents.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DocuSign_Logo.svg/220px-DocuSign_Logo.svg.png",
            careerPageLink = "https://careers.docusign.com/",
            companyDomain = "https://www.docusign.com/",
            companyProducts = "Electronic signature solutions",
            companyImages = listOf(
                "https://www.docusign.com/sites/default/files/2018-02/ns-ds_restaurant_03.png",
                "https://www.docusign.com/sites/default/files/2018-03/Invoca-CS.jpg",
                "https://www.docusign.com/sites/default/files/2018-02/ns-ds_hotels_01.png"
            )
        ),

        Company(

            companyName = "Workday, Inc.",
            nameOfCEO = "Aneel Bhusri",
            companyFounder = "David Duffield, Aneel Bhusri",
            year = "2005",
            about = "Workday is an American on-demand financial management and human capital management software vendor.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Workday_logo.svg/220px-Workday_logo.svg.png",
            careerPageLink = "https://www.workday.com/en-us/company/careers/overview.html",
            companyDomain = "https://www.workday.com/",
            companyProducts = "HR management, Financial management, Analytics and Reporting",
            companyImages = listOf(
                "https://s3.amazonaws.com/static.companiesinc.com/workday.jpg",
                "https://miro.medium.com/max/3200/1*TaFxxDrxkEm0RfBds1ZB8Q.jpeg",
                "https://explore.workday.com/beesworkday/wp-content/uploads/2017/01/Article-Image-2017_Milestones-in-Workplace-Technology_982x428_enUS.jpg"
            ) ),
        Company(

            companyName = "JD.com, Inc.",
            nameOfCEO = "Richard Liu",
            companyFounder = "Richard Liu",
            year = "1998",
            about = "JD.com, Inc. is a Chinese e-commerce company that provides online retail, logistics, and technology services to consumers, businesses, and other e-commerce platforms.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/c/c4/JD.com_logo.png/150px-JD.com_logo.png",
            careerPageLink = "https://corporate.jd.com/careers",
            companyDomain = "https://www.jd.com/",
            companyProducts = "Retail services",
            companyImages = listOf(
                "https://image.slidesharecdn.com/ajbgrowthfestival2017sessionsummarydec172017-171228170601/95/ajb-growth-festival-2017-session-summary-37-638.jpg?cb=1514490302",
                "https://images.chinadaily.com.cn/2018-06/23/content_36413107.htm",
                "https://static1.squarespace.com/static/5a8297c600b08ecd28924a11/t/5ab2d9810e2e725b802235f1/1521732184053/JD.jpg"
            ) ),
        Company(

            companyName = "SAP SE",
            nameOfCEO = "Christian Klein",
            companyFounder = "Dietmar Hopp, Hasso Plattner, Claus Wellenreuther, Klaus Tschira, and Hans-Werner Hector",
            year = "1972",
            about = "SAP is a German-based multinational software corporation that makes enterprise software to manage business operations and customer relations.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/SAP_2011_logo.svg/220px-SAP_2011_logo.svg.png",
            careerPageLink = "https://www.sap.com/about/careers.html",
            companyDomain = "https://www.sap.com",
            companyProducts = "Enterprise software",
            companyImages = listOf(
                "https://d2z8535z5elu5h.cloudfront.net/documents/4395/5834/sap_cloud_platform.jpg",
                "https://d1.awsstatic.com/partner-network/QuickStart/datasheets/enterprise-sap-s4-hana-on-aws.png",
                "https://www.networkworld.com/wp-content/uploads/2017/10/sap-logo-100738732-large.jpg"
            ) ),
        Company(
            companyName = "Roblox Corporation",
            nameOfCEO = "David Baszucki",
            companyFounder = "David Baszucki, Erik Cassel",
            year = "2004",
            about = "Roblox Corporation is an American video game development company. It offers a platform for users to develop and play video games. The platform also hosts a social network of sorts, where users can create their own avatars, chat with other players, and purchase virtual items.",
            companyLogo = "https://www.roblox.com/favicon.ico",
            careerPageLink = "https://corp.roblox.com/careers/",
            companyDomain = "roblox.com",
            companyProducts = "Roblox gaming platform",
            companyImages = listOf(
                "https://cdn.vox-cdn.com/thumbor/-QnZdRjKzJWi-MhV9XJLb0yFeqs=/0x0:3000x1688/1200x800/filters:focal(1260x619:1740x1099)/cdn.vox-cdn.com/uploads/chorus_image/image/59814221/170706_3260_0002.0.jpg",
                "https://cdn-images-1.medium.com/max/1200/1*AgvmwdshNBh0Wo8NoKhZNw.jpeg"
            ) ),
        Company(
            companyName = "Electronic Arts Inc.",
            nameOfCEO = "Andrew Wilson",
            companyFounder = "Trip Hawkins",
            year = "1982",
            about = "Electronic Arts is an American video game company. It has developed and published video games such as Madden NFL, FIFA, Star Wars, and Need for Speed. The company is known for its sports titles and its use of license agreements with major sports leagues such as the NFL and FIFA.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Electronic_Arts_2020.svg/220px-Electronic_Arts_2020.svg.png",
            careerPageLink = "https://www.ea.com/careers/careers-overview",
            companyDomain = "ea.com",
            companyProducts = "Video games",
            companyImages = listOf(
                "https://www.ea.com/content/dam/eacom/en-us/news/Article_Images/2019/2019-q4-guidance-header-2560x1440.jpg.adapt.crop16x9.409p.jpg",
                "https://images.firstpost.com/wp-content/uploads/2020/06/EA-on-Steam-Image.jpg"
            ) ),
        Company(
            companyName = "Adobe Inc.",
            nameOfCEO = "Shantanu Narayen",
            companyFounder = "John Warnock, Charles Geschke",
            year = "1982",
            about = "Adobe is an American software company. It has developed and published software such as Photoshop, Acrobat, Illustrator, and InDesign. The company is known for its Creative Suite line of products, which are used by professionals in fields such as graphic design, web design, and video editing.",
            companyLogo = "https://www.adobe.com/favicon.ico",
            careerPageLink = "https://www.adobe.com/careers.html",
            companyDomain = "adobe.com",
            companyProducts = "Software",
            companyImages = listOf(
                "https://provenrepro.files.wordpress.com/2018/06/adobe-logo.jpg",
                "https://marketingland.com/wp-content/ml-loads/2018/05/adobe-stock-1.jpg"
            ) ),
        Company(
            companyName = "RingCentral, Inc.",
            nameOfCEO = "Vlad Shmunis",
            companyFounder = "Vlad Shmunis",
            year = "1999",
            about = "RingCentral is an American provider of cloud-based communication systems. It offers messaging, video conferencing, phone, and contact center solutions. The company's products are used by businesses of all sizes to improve communication and collaboration.",
            companyLogo = "https://www.ringcentral.com/favicon.ico",
            careerPageLink = "https://www.ringcentral.com/company/careers/overview.html",
            companyDomain = "ringcentral.com",
            companyProducts = "Cloud-based communication systems",
            companyImages = listOf(
                "https://www.ringcentral.com/content/dam/rc/images/pr/solutions/smb/hero/smb-communications-hero.jpg",
                "https://2s7gjr373w3x22jf92z99mgm5s.wpengine.netdna-cdn.com/pdf/Logo_Spotlight_RingCentral.pdf"
            ) ),
        Company(
            companyName = "Twilio Inc.",
            nameOfCEO = "Jeff Lawson",
            companyFounder = "Jeff Lawson, John Wolthuis, and Evan Cooke",
            year = "2008",
            about = "Twilio is a cloud communication platform that enables businesses to communicate with customers via SMS, voice, video, and chat. It offers a range of solutions, including messaging, voice and video, authentication, and more.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Twilio-logo-red.svg/220px-Twilio-logo-red.svg.png",
            careerPageLink = "https://www.twilio.com/en-us/company/jobs",
            companyDomain = "twilio.com",
            companyProducts = "Twilio Flex, Twilio SendGrid, Twilio API, Twilio Studio, and more.",
            companyImages = listOf(
                "https://www.twilio.com/marketing/bundles/marketing/assets/home/success-stories/success-stories-engaging-ecommerce-7ccca2b3a0c1a2f068ebdf7f239aacbf.jpg",
                "https://www.twilio.com/marketing/bundles/marketing/assets/home/developers-image/taskrouter_redesigned-96b78be52e8851bbf7fcf2bfc9c9fc47.png",
                "https://www.twilio.com/marketing/bundles/marketing/assets/home/integrations-integrating-teams-fd1e9ac6e066f6a17c19ec113d473d48.jpg"
            ) ),
        Company(
            companyName = "Match Group, Inc.",
            nameOfCEO = "Shar Dubey",
            companyFounder = "Gary Kremen",
            year = "2009",
            about = "Match Group is a leading provider of online dating products and services. It operates a portfolio of popular dating apps, including Tinder, Hinge, OkCupid, and more.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/MG_Logo_Horizontal_LightBackground.png/220px-MG_Logo_Horizontal_LightBackground.png",
            careerPageLink = "https://mtch.com/careers/",
            companyDomain = "mtch.com",
            companyProducts = "Tinder, Hinge, Match, OkCupid, PlentyOfFish, and more.",
            companyImages = listOf(
                "https://www.gannett-cdn.com/presto/2021/06/01/USAT/6aaf94fd-d51b-43de-8f05-98b2d2a9c9a8-GettyImages-1299536365.jpg?crop=6002,3376,x0,y0&width=3200&height=1801&format=pjpg&auto=webp",
                "https://www.rollingstone.com/wp-content/uploads/2018/09/rs-tinder-match-hinge-profile-ratings.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhYJexAaHSFXpNJV6KjNN6p0gTmTCDJ66Kdw&usqp=CAU"
            ) ),
        Company(
            companyName = "Autodesk, Inc.",
            nameOfCEO = "Andrew Anagnost",
            companyFounder = "John Walker, Dan Drake",
            year = "1982",
            about = "Autodesk is a software company that provides solutions for the architecture, engineering, construction, manufacturing, media, and entertainment industries. Its products include AutoCAD, Inventor, Fusion 360, and more.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Autodesk_Logo_2021.svg/220px-Autodesk_Logo_2021.svg.png",
            careerPageLink = "https://www.autodesk.com/careers",
            companyDomain = "autodesk.com",
            companyProducts = "AutoCAD, Inventor, Revit, 3ds Max, Maya, Fusion 360, and more.",
            companyImages = listOf(
                "https://www.autodesk.com/content/dam/autodesk/www/corporate/images/homepage/homepage-hero-1-image-construction.jpg",
                "https://www.autodesk.com/content/dam/autodesk/www/products/fusion-360/images/nav/fusion-360.svg",
                "https://www.autodesk.com/content/dam/autodesk/www/products/3ds-max/fy22/3ds-max-2022-experience.jpg"
            ) ),


        Company(
            companyName = "The Trade Desk, Inc.",
            nameOfCEO = "Jeff Green",
            companyFounder = "Jeff Green and Dave Pickles",
            year = "2009",
            about = "The Trade Desk, Inc. is a global technology company that provides a self-service platform for buyers of digital advertising. The platform allows advertisers to reach their target audiences across various devices, formats, and channels.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/The_Trade_Desk.svg/220px-The_Trade_Desk.svg.png",
            careerPageLink = "https://www.thetradedesk.com/careers/jobs",
            companyDomain = "thetradedesk.com",
            companyProducts = "The Trade Desk Platform, Connected TV, Audio, Mobile, Display, Native, Data Management Platform, Unified ID 2.0",
            companyImages = listOf(
                "https://www.thetradedesk.com/wp-content/uploads/2021/05/The-Trade-Desk-data-platform-graphic.jpg",
                "https://www.thetradedesk.com/wp-content/uploads/2020/05/email-theater-appleTV-1.png",
                "https://www.thetradedesk.com/wp-content/uploads/2018/03/2017-12-22-TTD-Holiday-GIF_V2-1.gif"
            )
        ),
        Company(
            companyName = "NVIDIA Corporation",
            nameOfCEO = "Jensen Huang",
            companyFounder = "Jensen Huang, Chris Malachowsky, and Curtis Priem",
            year = "1993",
            about = "NVIDIA Corporation is an American multinational technology company that designs graphics processing units (GPUs) for gaming and professional use. The company also produces system-on-a-chip units (SoCs) for mobile computing and automotive markets.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/NVIDIA_logo.svg/220px-NVIDIA_logo.svg.png",
            careerPageLink = "https://www.nvidia.com/en-us/about-nvidia/careers/",
            companyDomain = "nvidia.com",
            companyProducts = "GeForce, Quadro, Jetson, Tesla, DRIVE AGX, HGX-2",
            companyImages = listOf(
                "https://images.nvidia.com/content/tegra/nvidia_tegra_k1.png",
                "https://images.nvidia.com/content/volta-architecture/img/volta-quadro-demo-3.jpg",
                "https://images.nvidia.com/content/dam/en-zz/Solutions/geforce/geforce-rtx-battlefield-v-desktop-list-page-fullscreen-1920x1080-062"
            )
        ),

        Company(

            companyName = "ServiceNow, Inc.",
            nameOfCEO = "Bill McDermott",
            companyFounder = "Fred Luddy",
            year = "2004",
            about = "ServiceNow is an American software company that provides cloud-based solutions for IT service management, IT operations management, and IT business management.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/ServiceNow_logo.svg/220px-ServiceNow_logo.svg.png",
            careerPageLink = "https://www.servicenow.com/careers.html",
            companyDomain = "servicenow.com",
            companyProducts = "IT Service Management, IT Operations Management, IT Business Management",
            companyImages = listOf(
                "https://www.servicenow.com/content/dam/servicenow-assets/public/en-us/images/company"
            )
        ),

        Company(
            companyName = "CrowdStrike Holdings, Inc.",
            nameOfCEO = "George Kurtz",
            companyFounder = "George Kurtz, Dmitri Alperovitch, and Gregg Marston",
            year = "2011",
            about = "CrowdStrike is a cybersecurity technology company that provides endpoint security, threat intelligence, and incident response services to its clients.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/CrowdStrike_logo.svg/220px-CrowdStrike_logo.svg.png",
            careerPageLink = "https://www.crowdstrike.com/careers/",
            companyDomain = "crowdstrike.com",
            companyProducts = "Endpoint Protection, Threat Intelligence, Incident Response",
            companyImages = listOf(
                "https://www.crowdstrike.com/wp-content/uploads/2021/03/CrowdStrike_Logo.png")
        ),


        Company(

            companyName = "Square Enix Holdings Co., Ltd.",
            nameOfCEO = "Yosuke Matsuda",
            companyFounder = "Square Enix was founded by the merger of Square Co., Ltd. and Enix Corporation",
            year = "2003",
            about = "Square Enix is a Japanese video game developer, publisher, and distributor. It is best known for its popular franchises such as Final Fantasy, Dragon Quest, and Kingdom Hearts.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Square_Enix_logo.svg/230px-Square_Enix_logo.svg.png",
            careerPageLink = "https://www.jp.square-enix.com/recruit/career/",
            companyDomain = "square-enix.com",
            companyProducts = "Video Games, Manga, Anime",
            companyImages = listOf(
                "https://www.hdwallpapers.in/download/square_enix_logo-1600x900.jpg")
        ),


        Company(
            companyName = "Splunk Inc.",
            nameOfCEO = "Doug Merritt",
            companyFounder = "Erik Swan, Rob Das, Michael Baum",
            year = "2003",
            about = "Splunk Inc. is an American company based in San Francisco, California, that produces software for searching, monitoring, and analyzing machine-generated big data, via a web-style interface.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Splunk_logo.svg/220px-Splunk_logo.svg.png",
            careerPageLink = "https://www.splunk.com/en_us/careers/search-jobs.html",
            companyDomain = "splunk.com",
            companyProducts = "Splunk Enterprise, Splunk Cloud, Splunk Light, Splunk IT Service Intelligence (ITSI), Splunk User Behavior Analytics (UBA), Splunk Phantom, Splunk Mission Control",
            companyImages = listOf(
                "https://www.splunk.com/content/dam/splunk2/images/Spunk-logo-black.svg",
                "https://www.splunk.com/content/dam/splunk2/images/corporate/press-releases/2019/splunk-inc-logo.jpg")
        ),


        Company(

            companyName = "Dropbox, Inc.",
            nameOfCEO = "Drew Houston",
            companyFounder = "Drew Houston, Arash Ferdowsi",
            year = "2007",
            about = "Dropbox is a file hosting service that offers cloud storage, file synchronization, personal cloud, and client software.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Dropbox_logo_2017.svg/200px-Dropbox_logo_2017.svg.png",
            careerPageLink = "https://www.dropbox.com/jobs",
            companyDomain = "dropbox.com",
            companyProducts = "Dropbox Basic, Dropbox Plus, Dropbox Professional, Dropbox Business, Dropbox Enterprise",
            companyImages = listOf(
                "https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_glyph_m1-vflOyzkU_.svg",
                "https://images.ctfassets.net/1b15yqlj8f2t/1e1ZW76KguWIxJG0up8PvY/967594d1971df9b30e2b81f2e1f352e5/Dropbox_Blog_Heroes_Template.jpg")
        ),


        Company(
            companyName = "Coupa Software Incorporated",
            nameOfCEO = "Rob Bernshteyn",
            companyFounder = "Noah Eisner, Dave Stephens",
            year = "2006",
            about = "Coupa Software is a global technology platform for Business Spend Management (BSM).",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/Coupa_logo.svg/220px-Coupa_logo.svg.png",
            careerPageLink = "https://careers.coupa.com/global/en/home",
            companyDomain = "coupa.com",
            companyProducts = "Coupa Procure, Coupa Expenses, Coupa Contracts, Coupa Invoicing, Coupa Sourcing, Coupa Analytics, Coupa Supplier Management, Coupa Inventory, Coupa Travel & Expense Management, Coupa Treasury Management, Coupa Payments",
            companyImages = listOf(
                "https://www.coupa.com/content/dam/coupa-website/logo/coupa-logo-01.svg",
                "https://www.coupa.com/content/dam/coupa-website/coupa-feature-tiles-bg-12.jpg")
        ),

        Company(
            companyName = "Chegg, Inc.",
            nameOfCEO = "Dan Rosensweig",
            companyFounder = "Aayush Phumbhra, Osman Rashid",
            year = "2005",
            about = "Chegg, Inc. is an American education technology company that specializes in online textbook rentals, homework help, online tutoring, scholarships and internship matching. It is meant to help students in high school and college. Chegg's headquarters are in Santa Clara, California.",
            companyLogo = "https://logo.clearbit.com/chegg.com",
            careerPageLink = "https://jobs.chegg.com/",
            companyDomain = "chegg.com",
            companyProducts = "Chegg Study, Chegg Writing, Chegg Tutors, Chegg Math Solver, Chegg Internships, Chegg CareerMatch",
            companyImages = listOf("https://cdn.corporatefinanceinstitute.com/assets/chegg.jpeg",
                "https://www.educationdive.com/news/inside-cheggs-data-driven-approach-to-student-success/554295/",
                "https://www.couponcoder.com/chegg-review/")
        ),
        Company(
            companyName = "Zuora, Inc.",
            nameOfCEO = "Tien Tzuo",
            companyFounder = "Tien Tzuo, K.V. Rao",
            year = "2007",
            about = "Zuora, Inc. is an American cloud-based software company that provides subscription management software services. Its software allows businesses to launch, manage, and transform into subscription businesses. The company serves various industries, including SaaS, media, telecommunications, IoT, and manufacturing. Zuora is headquartered in Foster City, California, and has additional offices in the US, Europe, Asia, and Australia.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Zuora_logo_navy.svg/220px-Zuora_logo_navy.svg.png",
            careerPageLink = "https://www.zuora.com/careers/",
            companyDomain = "www.zuora.com",
            companyProducts = "Zuora Billing, Zuora CPQ, Zuora Collect, Zuora Insights, Zuora RevPro, and more",
            companyImages = listOf(
                "https://www.zuora.com/wp-content/themes/zuora/images/hero-images/zuora-landing-hero.jpg",
                "https://www.zuora.com/wp-content/themes/zuora/images/solutions/solution-overview-header.jpg",
                "https://www.zuora.com/wp-content/uploads/2022/02/Subscription-Economy-Index-Report-Q4-2021.jpg"
            )
        ),


        Company(
            companyName = "Snowflake Inc.",
            nameOfCEO = "Frank Slootman",
            companyFounder = "Benoit Dageville, Thierry Cruanes, and Marcin Zukowski",
            year = "2012",
            about = "Snowflake Inc. is a cloud-based data warehousing company that allows businesses to store, manage, and analyze large amounts of data in real time using cloud computing resources. The company's platform enables users to unify, integrate, analyze, and share data across multiple clouds and regions, helping businesses to derive meaningful insights and make data-driven decisions. Snowflake's platform is known for its flexibility, scalability, and ease of use, and has gained popularity among businesses of all sizes and industries.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Snowflake_Logo.svg/220px-Snowflake_Logo.svg.png",
            careerPageLink = "https://www.snowflake.com/careers/",
            companyDomain = "snowflake.com",
            companyProducts = "Snowflake Cloud Data Platform, Snowflake Data Marketplace",
            companyImages = listOf("https://www.snowflake.com/wp-content/uploads/2018/08/whitepaper_header_2560x1440.jpg", "https://www.snowflake.com/wp-content/uploads/2021/02/SF_Logotype_RGB.png", "https://www.snowflake.com/wp-content/uploads/2021/03/Snowflake_Key_Messaging_Graphic.png")
        ),

        Company(
            companyName = "Intuit Inc.",
            nameOfCEO = "Sasan Goodarzi",
            companyFounder = "Scott Cook and Tom Proulx",
            year = "1983",
            about = "Intuit is a financial software company that develops and sells financial, accounting, and tax preparation software for individuals and businesses. The company's flagship products include QuickBooks, TurboTax, and Mint. Intuit's mission is to power prosperity around the world, and it is dedicated to helping its customers succeed through innovation and technology.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Intuit_logo_2022.svg/220px-Intuit_logo_2022.svg.png",
            careerPageLink = "https://www.intuit.com/careers/",
            companyDomain = "Enterprise software",
            companyProducts = "QuickBooks, TurboTax, Mint, QuickBooks Self-Employed, QuickBooks Online, and more",
            companyImages = listOf(
                "https://www.intuit.com/content/dam/intuit/intuitcom/about-us/assets/branding/Intuit_Logo_Primary_Blue_RGB.png",
                "https://www.intuit.com/content/dam/intuit/intuitcom/about-us/assets/branding/QuickBooks_Primary_RGB.png",
                "https://www.intuit.com/content/dam/intuit/intuitcom/about-us/assets/branding/TurboTax_Primary_RGB.png",
                "https://www.intuit.com/content/dam/intuit/intuitcom/about-us/assets/branding/Mint_Primary_RGB.png"
            )

        ),

        Company(
            companyName = "Palo Alto Networks, Inc.",
            nameOfCEO = "Nikesh Arora",
            companyFounder = "Nir Zuk",
            year = "2005",
            about = "Palo Alto Networks is a multinational cybersecurity company based in Santa Clara, California. The company provides advanced firewall protection, cloud security, and other cybersecurity products and services to help organizations protect their networks and data from cyber threats. Palo Alto Networks has been recognized as a leader in the Gartner Magic Quadrant for Network Firewalls and has won numerous awards for its innovative cybersecurity solutions.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/PaloAltoNetworks_2020_Logo.svg/220px-PaloAltoNetworks_2020_Logo.svg.png",
            careerPageLink = "https://www.paloaltonetworks.com/company/careers",
            companyDomain = "Tech",
            companyProducts = "Palo Alto Networks offers a range of cybersecurity products and services, including next-generation firewalls, cloud security, endpoint protection, and threat intelligence solutions.",
            companyImages = listOf("")
        ),

        Company(
            companyName = "Logitech International S.A.",
            nameOfCEO = "Bracken Darrell",
            companyFounder = "Daniel Borel, Pierluigi Zappacosta, Giacomo Marini",
            year = "1981",
            about = "Logitech is a Swiss manufacturer of computer peripherals and software, including mice, keyboards, webcams, speakers, and more. The company was founded in Switzerland in 1981 and has since become a leading producer of computer accessories, with products sold in over 100 countries around the world.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Logitech_logo.svg/220px-Logitech_logo.svg.png",
            careerPageLink = "https://jobs.jobvite.com/logitech/",
            companyDomain = "Electronics, Technology",
            companyProducts = "Computer peripherals, software",
            companyImages = listOf(
                "https://www.logitech.com/assets/65521/26/hero-desktop.png",
                "https://www.logitech.com/assets/65517/3/mx-vertical-gallery-2.jpg",
                "https://www.logitech.com/assets/65519/3/mx-master-3-gallery-4.jpg",
                "https://www.logitech.com/assets/65518/3/hero-accessories-2.jpg"
            )
        ),

        Company(
            companyName = "Roku, Inc.",
            nameOfCEO = "Anthony Wood",
            companyFounder = "Anthony Wood",
            year = "2002",
            about = "Roku, Inc. is a streaming TV and media player company based in California, USA. The company was founded in 2002 by Anthony Wood and is best known for its range of streaming devices, which enable customers to access a wide variety of internet-based content on their TVs. Roku also offers a platform for content providers to distribute their content to Roku users. The company has partnerships with numerous media companies and offers over 500,000 movies and TV shows to its customers.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Roku_logo.svg/220px-Roku_logo.svg.png",
            careerPageLink = "https://www.roku.com/about/jobs",
            companyDomain = "Digital media player",
            companyProducts = "Roku streaming devices, Roku TVs, Roku OS, Roku Channel",
            companyImages = listOf(
                "https://images.unsplash.com/photo-1520055177081-ecc197c2cd19?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzZ8fHJva3UlMjBmaWdodG5lc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                "https://images.unsplash.com/photo-1570724069084-0fdeda82b77a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fHJva3UlMjBmaWdodG5lc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                "https://images.unsplash.com/photo-1534327470086-8f129e1688ce?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHJva3UlMjBmaWdodG5lc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
            )
        ),
        Company(
            companyName = "JPMorgan Chase & Co.",
            nameOfCEO = "Jamie Dimon",
            companyFounder = "J. Pierpont Morgan",
            year = "1799",
            about = "JPMorgan Chase & Co. is a multinational investment bank and financial services company. It offers a range of financial services across investment banking, commercial banking, asset management, and private banking. JPMorgan Chase & Co. is one of the largest banks in the United States, with assets of more than $3.7 trillion as of 2021. It operates in more than 100 countries around the world.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/J_P_Morgan_Chase_Logo_2008_1.svg/250px-J_P_Morgan_Chase_Logo_2008_1.svg.png",
            careerPageLink = "https://careers.jpmorgan.com/us/en/home",
            companyDomain = "Investment banking",
            companyProducts = "Investment banking, commercial banking, asset management, private banking, credit cards, mortgage, and more",
            companyImages = listOf("https://www.jpmorganchase.com/content/dam/shared/aboutus/our-businesses/businesses-hero-desktop.jpg", "https://www.jpmorganchase.com/content/dam/shared/aboutus/our-businesses/investment-banking-hero-desktop.jpg", "https://www.jpmorganchase.com/content/dam/shared/aboutus/our-businesses/consumer-banking-hero-desktop.jpg")
        ),


        Company(
            companyName = "Goldman Sachs",
            nameOfCEO = "David M. Solomon",
            companyFounder = "Marcus Goldman and Samuel Sachs",
            year = "1869",
            about = "Goldman Sachs is a leading global investment banking, securities and investment management firm that provides a wide range of financial services to a substantial and diversified client base that includes corporations, financial institutions, governments, and high-net-worth individuals.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Goldman_Sachs.svg/125px-Goldman_Sachs.svg.png",
            careerPageLink = "https://www.goldmansachs.com/careers/",
            companyDomain = "Investment banking",
            companyProducts = "Investment banking, securities, investment management",
            companyImages = listOf(
                "https://www.goldmansachs.com/images/share/gs-storytelling-top.jpg",
                "https://www.goldmansachs.com/images/share/gs-history-timeline.jpg",
                "https://www.goldmansachs.com/images/share/gs-storytelling-bottom.jpg"
            )
        ),


        Company(
            companyName = "Tata Consultancy Services Limited",
            nameOfCEO = "Rajesh Gopinathan",
            companyFounder = "J.R.D. Tata and F.C. Kohli",
            year = "1968",
            about = "Tata Consultancy Services (TCS) is a multinational information technology (IT) services, business solutions, and consulting company headquartered in Mumbai, India. It is a subsidiary of the Tata Group and operates in 149 locations across 46 countries. TCS is one of the largest Indian companies by market capitalization and the second-largest Indian company by revenue, after Reliance Industries. It is also the largest IT services company in India by revenue.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Tata_Consultancy_Services_Logo.svg/250px-Tata_Consultancy_Services_Logo.svg.png",
            careerPageLink = "https://www.tcs.com/careers",
            companyDomain = "Information Technology",
            companyProducts = "TCS offers a range of IT services, business solutions, and consulting services to clients across various industries. Its services include application development and maintenance, infrastructure management, engineering and R&D services, enterprise solutions, business process outsourcing, digital learning, and many others.",
            companyImages = listOf("https://www.tcs.com/content/dam/tcs/images/offerings/enterprise-solutions/enterprise-platforms/tcs-ion-university.jpg","https://www.tcs.com/content/dam/tcs/images/offerings/business-process-services/enterprise-platforms/iris.jpg","https://www.tcs.com/content/dam/tcs/images/tcs-home/tcs-automation-2020.jpg","https://www.tcs.com/content/dam/tcs/images/offerings/application-services/microservices.jpg")
        ),

        Company(
            companyName = "Infosys Limited",
            nameOfCEO = "Salil Parekh",
            companyFounder = "N. R. Narayana Murthy, Nandan Nilekani, S. Gopalakrishnan, S. D. Shibulal, K. Dinesh ,Ashok Arora",

            year = "1981",
            about = "Infosys is an Indian multinational corporation that provides business consulting, information technology, and outsourcing services. It has its headquarters in Bangalore, Karnataka, India.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Infosys_logo.svg/220px-Infosys_logo.svg.png",
            careerPageLink = "https://www.infosys.com/careers/",
            companyDomain = "Information Technology, Business Consulting, and Outsourcing",
            companyProducts = "Infosys Nia, Infosys McCamish, Infosys Information Platform, Edgeverve Systems Limited, Panaya CloudQuality Suite, Skava, Stater, etc.",
            companyImages = listOf()
        ),

        Company(
            companyName = "Dassault Systèmes",
            nameOfCEO = "Bernard Charlès",
            companyFounder = "Francis Bernard and his team in 1981",
            year = "1981",
            about = "Dassault Systèmes SE is a French software company that specializes in 3D design, simulation, and project management software. Its products are used in a wide range of industries, including aerospace, automotive, consumer goods, defense, energy, life sciences, manufacturing, and construction.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/3/31/Dassault_Syst%C3%A8mes_logo.svg/220px-Dassault_Syst%C3%A8mes_logo.svg.png",
            careerPageLink = "https://www.3ds.com/careers/",
            companyDomain = "3DExperience Platform",
            companyProducts = "3DExperience Platform, CATIA, SOLIDWORKS, SIMULIA, DELMIA, ENOVIA, GEOVIA, EXALEAD",
            companyImages = listOf(
                "https://www.3ds.com/fileadmin/_processed_/2/a/csm_Ferrari_Dassault_Systemes_Case_Study_Cover_9e142ca74f.jpg",
                "https://www.3ds.com/fileadmin/_processed_/5/1/csm_03_Aerospace_Defense_6af72ca6ab.jpg",
                "https://www.3ds.com/fileadmin/_processed_/f/5/csm_ENOVIA_PLM_Solution_4c0a4d3c4f.jpg",
                "https://www.3ds.com/fileadmin/_processed_/c/3/csm_SOLIDWORKS_3D_Design_Software_f64e29f8af.jpg"
            )
        ),


        Company(
            companyName = "PhonePe",
            nameOfCEO = "Sameer Nigam",
            companyFounder = "Sameer Nigam, Rahul Chari, and Burzin Engineer",
            year = "2015",
            about = "PhonePe is an Indian digital payments platform. It allows users to transfer money, pay bills, and recharge mobile and DTH connections. It was acquired by Flipkart, an Indian e-commerce company, in 2016. PhonePe operates independently as a subsidiary of Flipkart. The company has its headquarters in Bangalore, India.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/7/71/PhonePe_Logo.svg/1920px-PhonePe_Logo.svg.png",
            careerPageLink = "https://www.phonepe.com/careers",
            companyDomain = "FinTech",
            companyProducts = "Digital payments platform",
            companyImages = listOf(
                "https://www.phonepe.com/images/home/brandBanners/flipkart.jpg",
                "https://www.phonepe.com/images/home/brandBanners/others.jpg"
            )
        ),

        Company(

            companyName = "BharatPe",
            nameOfCEO = "Ashneer Grover",
            companyFounder = "Ashneer Grover, Shashvat Nakrani",
            year = "2018",
            about = "BharatPe is a fintech startup that provides digital payment solutions for merchants in India. The company offers a range of services, including QR code-based payments, credit and debit card payments, and UPI payments, to help merchants accept payments from customers. BharatPe also provides a range of financial services, such as loans and insurance, to help small businesses grow.",
            companyLogo = "https://www.odishaage.com/wp-content/uploads/2020/05/BharatPe-Logo.jpg",
            careerPageLink = "https://bharatpe.com/career",
            companyDomain = "FinTech",
            companyProducts = "QR code-based payments, credit and debit card payments, UPI payments, loans, insurance",
            companyImages = listOf("https://www.bharatpe.com/wp-content/uploads/2019/09/BharatPe_Blog_New_Header_2.jpg", "https://www.bharatpe.com/wp-content/uploads/2019/09/BharatPe_Blog_New_Header_4.jpg")
        ),

        Company(
            companyName = "Lenovo Group Limited",
            nameOfCEO = "Yuanqing Yang",
            companyFounder = "Liu Chuanzhi",
            year = "1984",
            about = "Lenovo is a multinational technology company based in Beijing, China. It designs, develops, manufactures, and sells personal computers, tablets, smartphones, workstations, servers, electronic storage devices, and IT management software. Lenovo is currently the world's largest personal computer vendor by unit sales. The company has a global workforce of over 60,000 employees and operates in more than 60 countries.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Lenovo_%282015%29.svg/220px-Lenovo_%282015%29.svg.png",
            careerPageLink = "https://www.lenovocareers.com/",
            companyDomain = "Computer hardware, Electronics",
            companyProducts = "Personal computers, tablets, smartphones, workstations, servers, electronic storage devices, and IT management software.",
            companyImages = listOf("https://www.lenovo.com/medias/lenovo-logo.png", "https://www.lenovo.com/medias/ThinkPad-T14-AMD-1.jpg")

        ),


        Company(

            companyName = "ASUSTeK Computer Inc.",
            nameOfCEO = "Jerry Shen",
            companyFounder = "Ted Hsu, M.T. Liao, Wayne Hsieh and T.H. Tung",
            year = "1989",
            about = "ASUSTeK Computer Inc. (ASUS) is a multinational technology company headquartered in Taiwan that specializes in the design and manufacturing of computer hardware, software, and consumer electronics. ASUS is best known for its computer hardware products, including desktop computers, laptops, and computer components such as motherboards, graphics cards, and routers. The company also produces smartphones, tablets, and other consumer electronics. ASUS has a global presence with offices in over 30 countries and operates through several subsidiaries, including ASUS Technology Pvt. Ltd. in India and ASUS Computer GmbH in Germany.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/ASUS_Logo.svg/220px-ASUS_Logo.svg.png",
            careerPageLink = "https://www.asus.com/ca-en/ASUS-Employment/search-opportunities/",
            companyDomain = "Computer hardware, Electronics",
            companyProducts = "Computers, laptops, motherboards, graphics cards, routers, smartphones, tablets, and other consumer electronics.",
            companyImages = listOf("https://www.asus.com/media/global/products/ihnuiea2v7tylrrq/vi/m0adffrv2og4foxx/P_setting_fff_1_90_end_2000.png", "https://www.asus.com/media/global/products/ihnuiea2v7tylrrq/vi/8a0i1kwmcjywjfsd/P_setting_fff_1_90_end_2000.png", "https://www.asus.com/media/global/products/ihnuiea2v7tylrrq/vi/pdq5cboiq2wnwybm/P_setting_fff_1_90_end_2000.png")
        ),

        Company(
            companyName = "MSI",
            nameOfCEO = "Sheng-Chang Chiang",
            companyFounder = "Joseph Hsu, Jeans Huang, Frank Lin, Henry Lu, Kenny Yu, Simon Lin",
            year = "1986",
            about = "Micro-Star International (MSI) is a Taiwan-based multinational technology company that produces computer hardware, gaming hardware, and consumer electronics. MSI is best known for producing high-performance gaming laptops, desktops, and graphics cards. The company also produces a wide range of computer components and peripherals, including motherboards, monitors, power supplies, gaming peripherals, and servers. MSI has offices and facilities around the world, including in the US, Europe, and Asia.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/9/91/Micro-Star_International_logo.svg/220px-Micro-Star_International_logo.svg.png",
            careerPageLink = "https://www.msiworldwide.com/careers",
            companyDomain ="Computer hardware, Electronics",
            companyProducts = "Gaming laptops, desktops, graphics cards, motherboards, monitors, power supplies, gaming peripherals, servers, and more.",
            companyImages = listOf("https://www.msi.com/etc/designs/msi/images/logo/msi-header-logo.svg", "https://www.msi.com/etc/designs/msi/images/og/msi_og_1200x630.jpg")
        ),

        Company(
            companyName = "AMD",
            nameOfCEO = "Lisa Su",
            companyFounder = "Jerry Sanders",
            year = "1969",
            about = "Advanced Micro Devices, Inc. (AMD) is an American multinational semiconductor company that designs and manufactures microprocessors, graphics processors, and other computer components. AMD's main products include microprocessors, graphics processors, chipsets, and embedded processors for servers, workstations, personal computers, and embedded system applications. AMD is one of the largest suppliers of microprocessors in the world, competing with Intel in the PC and server markets.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/AMD_Logo.svg/200px-AMD_Logo.svg.png",
            careerPageLink = "https://www.amd.com/en/corporate/careers",
            companyDomain = "Semiconductors, Artificial intelligence, GPUs, Graphics cards, Consumer electronics, Video games, Computer hardware",
            companyProducts = "Microprocessors, Graphics processors, Chipsets, Embedded processors",
            companyImages = listOf("https://www.amd.com/system/files/2021-04/234332-amd-logo-reverse-black-rgb.png", "https://www.amd.com/system/files/styles/992px/private/2020-03/478233-amd-3950x-1260x709_0.png?itok=_Y7PIl0n")
        ),

        Company(
            companyName = "HP Inc.",
            nameOfCEO = "Enrique Lores",
            companyFounder = "Bill Hewlett and Dave Packard",
            year = "1939",
            about = "HP Inc. is a technology company that produces personal computers, printers, and related products. It was founded in 1939 by Bill Hewlett and Dave Packard and is headquartered in Palo Alto, California. HP operates in over 170 countries, has approximately 56,000 employees, and had a revenue of $58.8 billion in 2020.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/HP_logo_2012.svg/120px-HP_logo_2012.svg.png",
            careerPageLink = "https://jobs.hp.com/",
            companyDomain = "Computer hardware, Electronics",
            companyProducts = "Personal computers, printers, and related products",
            companyImages = listOf("https://www.hp.com/etc/designs/hp2/images/hero/hero_image_1.jpg", "https://www.hp.com/etc/designs/hp2/images/hero/hero_image_2.jpg", "https://www.hp.com/etc/designs/hp2/images/hero/hero_image_3.jpg")
        ),

        Company(
            companyName = "Acer",
            nameOfCEO = "Jason Chen",
            companyFounder = "Stan Shih",
            year = "1976",
            about = "Acer is a Taiwanese multinational hardware and electronics corporation that specializes in advanced electronics technology. It manufactures desktop PCs, laptops, tablets, servers, storage devices, virtual reality devices, displays, and peripherals. Acer also sells gaming PCs and accessories under its Predator brand.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Acer_2011.svg/220px-Acer_2011.svg.png",
            careerPageLink = "https://pa-careers.acer.com/",
            companyDomain = "Computer hardware, Electronics",
            companyProducts = "Desktop PCs, laptops, tablets, servers, storage devices, virtual reality devices, displays, peripherals, gaming PCs, and accessories",
            companyImages = listOf("https://www.acer.com/ac/zh/TW/content/home-hero-banner/nitro-5-hero.jpg",
                "https://www.acer.com/ac/zh/TW/content/home-hero-banner/predator-triton-hero.jpg",
                "https://www.acer.com/ac/zh/TW/content/home-hero-banner/chromebook-hero.jpg",
                "https://www.acer.com/ac/zh/TW/content/home-hero-banner/veriton-hero.jpg")
        ),


        Company(
            companyName = "Harman Kardon",
            nameOfCEO = "Michael Mauser",
            companyFounder = "Sidney Harman and Bernard Kardon",
            year = "1953",
            about = "Harman Kardon is a division of Samsung Electronics that produces high-quality audio equipment for home theaters, computers, and automotive applications. The brand is known for its sleek designs and advanced technology, including Bluetooth connectivity and voice control.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Harman_Kardon_logo.svg/220px-Harman_Kardon_logo.svg.png",
            careerPageLink = "https://www.harman.com/career",
            companyDomain = "Audio systems",
            companyProducts = "Home audio systems, soundbars, headphones, and automotive audio",
            companyImages = listOf()
        ),

        Company(

            companyName = "boAt",
            nameOfCEO = "Aman Gupta, Sameer Mehta",
            companyFounder = "Aman Gupta, Sameer Mehta",
            year = "2016",
            about = "boAt is a lifestyle brand that deals in fashionable consumer electronics like earphones, headphones, speakers, travel chargers and premium cables. They have a range of products that cater to various segments like athletes, fitness enthusiasts, and music lovers.",
            companyLogo = "https://media-thumbs.golden.com/6ngJFLSMVelJrPgAyZ-tGUJumuI=/100x100/smart/golden-storage-production.s3.amazonaws.com%2Ftopic_images%2F0737859136d44443b62f4a4640a05d0e.jpeg",
            careerPageLink = "https://www.boat-lifestyle.com/pages/career-opportunity",
            companyDomain = "Consumer electronics",
            companyProducts = "Earphones, Headphones, Speakers, Travel Chargers, Cables",
            companyImages = listOf("https://www.boat-lifestyle.com/assets/images/brandstory.jpg",
                "https://www.boat-lifestyle.com/assets/images/about_us.jpg",
                "https://www.boat-lifestyle.com/assets/images/our-products.jpg")),


        Company(

            companyName = "Shaadi.com",
            nameOfCEO = "Anupam Mittal",
            companyFounder = "Anupam Mittal",
            year = "1996",
            about = "Shaadi.com is an online wedding service founded in 1996 by Anupam Mittal. It has its headquarters in Mumbai, India and has branches all over India as well as in Dubai, London, and New York. The platform offers matchmaking services for people looking to get married, and has over 35 million registered users. Shaadi.com is one of the pioneers in the online matrimonial space in India and has been awarded several accolades for its services.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/4/4c/Shaadilogo_%28cropped%29.gif",
            careerPageLink = "https://careersatshaadi.recruitee.com/",
            companyDomain = "Online matchmaking services",
            companyProducts = "Shaadi.com",
            companyImages = listOf("https://www.shaadi.com/static/images/home/connections-banner.jpg",
                "https://www.shaadi.com/static/images/home/lifestyle-banner.jpg",
                "https://www.shaadi.com/static/images/home/matches-banner.jpg")
        ),


        Company(

            companyName = "Capgemini",
            nameOfCEO = "Aiman Ezzat",
            companyFounder = "Serge Kampf",
            year = "1967",
            about = "Capgemini is a global leader in consulting, digital transformation, technology, and engineering services. It operates in more than 50 countries and offers services in areas such as strategy and transformation, customer experience, digital, technology, and operations.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/d/d8/Capgemini_logo.svg/250px-Capgemini_logo.svg.png",
            careerPageLink = "https://www.capgemini.com/careers/",
            companyDomain = "Information technology",
            companyProducts = "Services in areas such as consulting, technology, and engineering",
            companyImages = listOf("https://www.capgemini.com/wp-content/uploads/2022/03/Solution_Overview_Banner-1.jpg",
                "https://www.capgemini.com/wp-content/uploads/2022/04/Excellence-in-Technology-1.jpg",
                "https://www.capgemini.com/wp-content/uploads/2022/04/Innovate-at-Speed-and-Scale-1.jpg")
        ),


        Company(

            companyName = "Snap Inc.",
            nameOfCEO = "Evan Spiegel",
            companyFounder = "Evan Spiegel, Bobby Murphy, Reggie Brown",
            year = "2011",
            about = "Snap Inc. is a technology and social media company that operates the popular social networking platform, Snapchat. The company is focused on developing camera and augmented reality technology and is known for its creative and engaging features, such as filters, lenses, and stories. It is also expanding into other areas, such as gaming and e-commerce.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Snap_Inc._logo.svg/220px-Snap_Inc._logo.svg.png",
            careerPageLink = "https://www.snap.com/en-US/jobs/",
            companyDomain = "Social media",
            companyProducts = "Snapchat, Bitmoji, Spectacles, Spotlight",
            companyImages = listOf("https://www.snap.com/global/social-card.png", "https://cdn.vox-cdn.com/thumbor/yLrzCDJZt0L3qJz8fWp1xVxN9Kg=/0x0:1918x1280/920x613/filters:focal(733x293:1049x609):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/69328657/Snapchat_Logo.0.png")
        ),


        Company(

            companyName = "Zomato",
            nameOfCEO = "Deepinder Goyal",
            companyFounder = "Deepinder Goyal and Pankaj Chaddah",
            year = "2008",
            about = "Zomato is a food delivery and restaurant discovery platform headquartered in India. It operates in 24 countries and serves over 70 million users per month. Zomato allows users to search for restaurants, view menus, read and write reviews, and order food online for delivery.",
            companyLogo = "https://logo.clearbit.com/zomato.com",
            careerPageLink = "https://www.zomato.com/careers",
            companyDomain = "Online food ordering",
            companyProducts = "Food delivery, restaurant discovery, table reservation, and online ordering",
            companyImages = listOf("https://d4t7t8y8xqo0t.cloudfront.net/resized/720X2000/cms/20200219160626-4.jpg", "https://d4t7t8y8xqo0t.cloudfront.net/resized/720X2000/cms/20210218101219-banner%20(1).png")
        ),


        Company(

            companyName = "Swiggy",
            nameOfCEO = "Sriharsha Majety",
            companyFounder = "Sriharsha Majety, Nandan Reddy, and Rahul Jaimini",
            year = "2014",
            about = "Swiggy is a food ordering and delivery company based in Bangalore, India. It was founded in 2014 by Sriharsha Majety, Nandan Reddy, and Rahul Jaimini. The company has a network of delivery personnel who pick up food from restaurants and deliver it to customers. Swiggy operates in more than 500 cities across India, and has expanded into new markets such as UAE, Kuwait, and Sri Lanka.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Swiggy_logo.svg/220px-Swiggy_logo.svg.png",
            careerPageLink = "https://careers.swiggy.com/",
            companyDomain = "Online food ordering",
            companyProducts = "Food ordering and delivery services",
            companyImages = listOf("https://www.swiggy.com/static/images/swiggy-logo-1200x630.png", "https://www.swiggy.com/static/images/swiggy_story_landing_page.png", "https://www.swiggy.com/static/images/swiggy_expansion.png")
        ),


        Company(
            companyName = "Flipkart",
            nameOfCEO = "Kalyan Krishnamurthy",
            companyFounder = "Sachin Bansal and Binny Bansal",
            year = "2007",
            about = "Flipkart is an Indian e-commerce company headquartered in Bangalore, Karnataka, India. It was founded in 2007 by Sachin Bansal and Binny Bansal (not related). The company initially focused on book sales, before expanding into other product categories such as consumer electronics, fashion, and lifestyle products. In 2018, Flipkart was acquired by Walmart, an American multinational retail corporation. ",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Flipkart_logo.svg/250px-Flipkart_logo.svg.png",
            careerPageLink = "https://www.flipkartcareers.com/?#!/joblist",
            companyDomain = "E-Commerce",
            companyProducts = "E-commerce platform, Consumer electronics, Fashion, Lifestyle products",
            companyImages = listOf("https://www.logosvgpng.com/wp-content/uploads/2018/08/flipkart-logo-vector.png", "https://www.republicworld.com/img/2021/06/09/flipkart-696x392.jpg")
        ),


        Company(

            companyName = "Myntra",
            nameOfCEO = "Amar Nagaram",
            companyFounder = "Mukesh Bansal, Ashutosh Lawania and Vineet Saxena",
            year = "2007",
            about = "Myntra is an Indian fashion e-commerce company headquartered in Bengaluru, Karnataka, India. The company was founded in 2007 and was acquired by Flipkart in 2014. Myntra operates as a standalone fashion-focused business within the Flipkart Group.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/d/d5/Myntra_logo.png/220px-Myntra_logo.png",
            careerPageLink = "https://careers.myntra.com/",
            companyDomain = "E-Commerce",
            companyProducts = "Fashion and lifestyle products such as clothing, footwear, accessories, and beauty products",
            companyImages = listOf("https://assets.entrepreneur.com/content/3x2/2000/1591720987-Myntra.jpeg",
                "https://static.toiimg.com/photo/msid-79635689/79635689.jpg",
                "https://www.scoopwhoop.com/anj/myntra/uploads/2c66e1f1-1d19-4a91-9a51-973dc12c42af.jpg",
                "https://cdn.dnaindia.com/sites/default/files/styles/full/public/2020/07/30/914044-myntra.jpg")
        ),




        Company(

            companyName = "Indeed",
            nameOfCEO = "Chris Hyams",
            companyFounder = "Paul Forster and Rony Kahan",
            year = "2004",
            about = "Indeed is a global employment-related search engine for job listings. It operates in over 60 countries and in 28 languages. Job seekers can search for jobs and apply directly on Indeed's website or mobile app. Employers can also post job listings and search through resumes on the site. Indeed also offers resources for job seekers, such as career advice, salary comparisons, and company reviews.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Indeed_logo.svg/220px-Indeed_logo.svg.png",
            careerPageLink = "https://www.indeed.com/career",
            companyDomain = "Job search engine",
            companyProducts = "Job search engine, job posting, company reviews",
            companyImages = listOf("https://www.indeed.com/hire/img/indeed-logo.png")
        ),

        Company(

            companyName = "Uber Technologies, Inc.",
            nameOfCEO = "Dara Khosrowshahi",
            companyFounder = "Travis Kalanick and Garrett Camp",
            year = "2009",
            about = "Uber is a multinational transportation network company that offers ride-sharing, ride-hailing, and other transportation services. The company operates in over 900 metropolitan areas worldwide and has revolutionized the way people move around cities.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Uber_logo_2018.svg/220px-Uber_logo_2018.svg.png",
            careerPageLink = "https://www.uber.com/us/en/careers/",
            companyDomain = "Bike taxi aggregator services",
            companyProducts = "Ride-sharing, ride-hailing, food delivery, package delivery, and more.",
            companyImages = listOf("https://www.uber-assets.com/image/upload/f_auto,q_auto:eco,c_fill,w_1012,h_569/v1584640829/assets/f6/0e6e2a-8e4d-4d0c-bb92-d4b1a37bda9d/original/Uber-Driving-Ocean-Bench.jpg", "https://www.uber-assets.com/image/upload/f_auto,q_auto:eco,c_fill,w_1012,h_569/v1584640829/assets/f3/405ec7-f955-4b19-ba97-8028e3257d39/original/Uber-Eats-Pair.jpg", "https://www.uber-assets.com/image/upload/f_auto,q_auto:eco,c_fill,w_1012,h_569/v1584640829/assets/d8/75fb20-f1cf-4c09-8d0f-836c7a9f2bbd/original/Uber-Freight-Truck-Dusk.jpg")
        ),


        Company(

            companyName = "Ola",
            nameOfCEO = "Bhavish Aggarwal",
            companyFounder = "Bhavish Aggarwal and Ankit Bhati",
            year = "2010",
            about = "Ola is an Indian ride-hailing company offering services including ride-hailing, ride-sharing, and taxi services. It is headquartered in Bangalore, India, and operates in over 250 cities across India, Australia, New Zealand, and the United Kingdom.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/0/0f/Ola_Cabs_logo.svg/250px-Ola_Cabs_logo.svg.png",
            careerPageLink = "https://www.olacabs.com/careers",
            companyDomain = "Bike taxi aggregator services",
            companyProducts = "Ola, Ola Bike, Ola Rentals, Ola Outstation, Ola Corporate",
            companyImages = listOf("https://www.olacabs.com/webstatic/img/ola-micro-mobility.svg", "https://www.olacabs.com/webstatic/img/ola-city-taxi.svg", "https://www.olacabs.com/webstatic/img/ola-outstation.svg", "https://www.olacabs.com/webstatic/img/ola-bike.svg")
        ),


        Company(

            companyName = "LinkedIn",
            nameOfCEO = "Ryan Roslansky",
            companyFounder = "Reid Hoffman",
            year = "2002",
            about = "LinkedIn is a professional networking platform that allows members to create and manage their professional identities, connect with other professionals, and find new business opportunities. The platform is available in over 200 countries and is primarily used by professionals and businesses for recruiting and job searching.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/LinkedIn_2021.svg/200px-LinkedIn_2021.svg.png",
            careerPageLink = "https://careers.linkedin.com/",
            companyDomain = "Internet",
            companyProducts = "Professional networking platform",
            companyImages = listOf("https://cdn.pixabay.com/photo/2016/11/19/14/00/code-1839406_960_720.jpg", "https://cdn.pixabay.com/photo/2016/02/19/11/30/social-media-1215477_960_720.jpg")
        ),


        Company(

            companyName = "GitHub",
            nameOfCEO = "Nat Friedman",
            companyFounder = "Tom Preston-Werner, Chris Wanstrath, PJ Hyett",
            year = "2008",
            about = "GitHub is a web-based platform for version control and collaboration that lets developers work on code together and keep track of changes. It provides hosting for software development and a range of features that make it easy for teams to collaborate on projects of any size. The company offers both free and paid subscription plans for users.",
            companyLogo = "https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png",
            careerPageLink = "https://github.com/about/careers",
            companyDomain = "Collaborative version control",
            companyProducts = "GitHub",
            companyImages = listOf()
        ),

        Company(

            companyName = "Telegram Messenger LLP",
            nameOfCEO = "Pavel Durov",
            companyFounder = "Pavel Durov and Nikolai Durov",
            year = "2013",
            about = "Telegram is a cloud-based instant messaging app that focuses on speed, security, and privacy. The app allows users to send messages, photos, videos, and files of any type (doc, zip, mp3, etc.) to their contacts. Telegram also offers end-to-end encryption for all messages, ensuring that only the sender and intended recipient can read them. The app is available on multiple platforms, including iOS, Android, Windows, and macOS.",
            companyLogo = "https://telegram.org/img/t_logo.png",
            careerPageLink = "https://telegram.org/jobs",
            companyDomain = "Social media",
            companyProducts = "Instant messaging app",
            companyImages = listOf("https://telegram.org/img/Simple_2_0.png", "https://telegram.org/img/Dynamic_2_0.png")
        ),


        Company(

            companyName = "SpaceX",
            nameOfCEO = "Elon Musk",
            companyFounder = "Elon Musk",
            year = "2002",
            about = "SpaceX is a private American aerospace manufacturer and space transportation services company founded in 2002 by Elon Musk. The company's mission is to reduce the cost of space transportation and enable the colonization of Mars. SpaceX has developed and launched multiple spacecraft and rockets, including the Falcon 1, Falcon 9, Falcon Heavy, and Dragon spacecraft. In addition to launching satellites for commercial and government customers, SpaceX is also working on developing the Starship, a next-generation spacecraft capable of transporting up to 100 people to Mars and other destinations in the solar system.",
            companyLogo = "https://www.spacex.com/static/images/share.jpg",
            careerPageLink = "https://www.spacex.com/careers",
            companyDomain = "Space and Rockets",
            companyProducts = "Spacecraft, Rockets",
            companyImages = listOf("https://www.spacex.com/static/images/homepage/crew-3/crew-3.jpg",
                "https://www.spacex.com/static/images/homepage/starlink_october_21/normalized_crop.jpg",
                "https://www.spacex.com/static/images/mission_pages/starship/first-landing-hero.jpg")
        ),

        Company(

            companyName = "Boeing Company",
            nameOfCEO = "David L. Calhoun",
            companyFounder = "William E. Boeing",
            year = "1916",
            about = "The Boeing Company is a leading aerospace and defense corporation that designs, manufactures, and sells airplanes, rotorcraft, rockets, satellites, and missiles worldwide. It is the largest aerospace company in the world and has been a pioneer in the aviation industry since its founding in 1916. Boeing's products and services include commercial airplanes, defense, space and security systems, and aftermarket services. Its headquarters is located in Chicago, Illinois, United States.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Boeing_full_logo.svg/220px-Boeing_full_logo.svg.png",
            careerPageLink = "https://www.boeing.com/careers/",
            companyDomain = "boeing.com",
            companyProducts = "Airplanes, rotorcraft, rockets, satellites, missiles, and related products and services.",
            companyImages = listOf("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Boeing_Light.svg/1200px-Boeing_Light.svg.png", "https://www.boeing.com/assets/images/defense-space/space/sls/og-image.jpg", "https://www.boeing.com/assets/images/innovation/innovation-quarterly/2020/q1/assets/fighter-jet-mobile_540.jpg")
        ),


        Company(

            companyName = "Unacademy",
            nameOfCEO = "Gaurav Munjal",
            companyFounder = "Gaurav Munjal, Roman Saini, and Hemesh Singh",
            year = "2015",
            about = "Unacademy is an Indian online education technology company offering online classes and test preparation services for students preparing for competitive exams. The company's goal is to make high-quality education accessible to everyone by providing live classes from educators across India, along with study materials and interactive quizzes.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Unacademy_Logo.png/220px-Unacademy_Logo.png",
            careerPageLink = "https://unacademy.com/careers",
            companyDomain = "Etech",
            companyProducts = "Online classes and test preparation services",
            companyImages = listOf("https://www.getmyuni.com/college-news/wp-content/uploads/2022/01/Unacademy-Partners-with-Gulzar-to-Offer-Indian-Poetry-Course-in-Hindi-and-English-500x333.jpg",
                "https://www.getmyuni.com/college-news/wp-content/uploads/2021/12/Unacademy-Signs-Triple-Jumper-Arvind-Kathare-for-Tokyo-2020-Olympic-Preparations-500x333.jpg",
                "https://www.getmyuni.com/college-news/wp-content/uploads/2021/10/Unacademy-and-Sanfoundry-Join-Forces-to-Offer-Free-Training-on-Technical-Skills-500x333.jpg")

        ),


        Company(

            companyName = "Rapido",
            nameOfCEO = "Aravind Sanka",
            companyFounder = "Aravind Sanka, Pavan Guntupalli, and Rishikesh SR",
            year = "2015",
            about = "Rapido is an Indian bike taxi aggregator company. The company allows users to book a bike ride through their mobile application. The service is currently available in more than 100 cities across India. The company claims to have more than 2 million customers and 500,000 registered riders on its platform.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/e/e8/Rapido_company_logo.svg/220px-Rapido_company_logo.svg.png",
            careerPageLink = "https://rapido.bike/careers.html",
            companyDomain = "https://www.rapido.bike/",
            companyProducts = "Bike taxi aggregator services",
            companyImages = listOf("https://www.rapido.bike/assets/images/bg/rapido_for_web.jpg",
                "https://www.rapido.bike/assets/images/bg/rapido-otb.jpg",
                "https://www.rapido.bike/assets/images/bg/rapido-pic-1.jpg",
                "https://www.rapido.bike/assets/images/bg/rapido-pic-2.jpg")
        ),


        Company(

            companyName = "Jio Platforms Limited",
            nameOfCEO = "Mukesh Ambani",
            companyFounder = "Mukesh Ambani",
            year = "2010",
            about = "Jio Platforms Limited is an Indian digital services company that offers wireless, high-speed mobile internet services and a range of digital products and services. It is a subsidiary of Reliance Industries Limited. Jio was launched in 2016 and quickly became the largest mobile network operator in India.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Reliance_Jio_Logo.svg/150px-Reliance_Jio_Logo.svg.png",
            careerPageLink = "https://careers.jio.com/",
            companyDomain = "Telecommunications",
            companyProducts = "Wireless mobile internet services, digital products and services",
            companyImages = listOf("https://images.financialexpress.com/2021/06/Jio-platforms.jpg", "https://bsmedia.business-standard.com/_media/bs/img/article/2017-04/24/full/1493037736-9565.jpg", "https://www.telegraphindia.com/1020121/images/21sport5.jpg")
        ),



        Company(

            companyName = "Bharti Airtel Limited",
            nameOfCEO = "Gopal Vittal",
            companyFounder = "Sunil Bharti Mittal",
            year = "1995",
            about = "Bharti Airtel Limited is an Indian global telecommunications company that operates in 18 countries across South Asia and Africa. It provides 2G, 3G, and 4G wireless services, fixed-line broadband, and voice services, depending on the country of operation. Airtel is India's second-largest mobile network operator and the world's third-largest mobile network operator with over 471 million subscribers. The company also offers digital TV, Airtel Payments Bank, and other services.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/1/18/Airtel_logo.svg/150px-Airtel_logo.svg.png",
            careerPageLink = "https://www.airtel.in/careers/",
            companyDomain = "Telecommunications",
            companyProducts = "Wireless services, fixed-line broadband, digital TV, Airtel Payments Bank, voice services",
            companyImages = listOf("https://www.airtel.in/content/dam/airtelbrand/migration/airtel-logo.svg",
                "https://www.airtel.in/content/dam/sma/airtel-in/legalandcompliances/Privacy-Policy/images/new-bg.jpg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/1-quick-access-recharge.svg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/2-high-speed-internet.svg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/3-postpaid-bill-payment.svg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/4-airtel-xstream.svg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/5-dth-services.svg",
                "https://www.airtel.in/content/dam/airtelbrand/migration/6-airtel-money.svg")
        ),


        Company(

            companyName = "Vodafone Idea Limited (VI)",
            nameOfCEO = "Ravinder Takkar",
            companyFounder = "Vodafone Group Plc and Aditya Birla Group",
            year = "2018 (merger of Vodafone India and Idea Cellular)",
            about = "VI is an Indian telecommunications company based in Mumbai, Maharashtra, India. It is a joint venture between Vodafone Group Plc and Aditya Birla Group, with Vodafone holding a 45.1% stake and Aditya Birla Group holding a 26% stake. VI provides mobile network services across India and is the third largest mobile network operator in India by subscriber base.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Vodafone_Idea_logo.svg/220px-Vodafone_Idea_logo.svg.png",
            careerPageLink = "https://careers.vodafoneidea.com/",
            companyDomain = "Telecommunications",
            companyProducts = "Mobile network services, 4G, 3G, 2G, Voice, Data, SMS",
            companyImages = listOf("https://www.vodafoneidea.com/content/dam/vodafone-idea/web/home-page/banner4.jpg", "https://www.vodafoneidea.com/content/dam/vodafone-idea/web/home-page/banner1.jpg", "https://www.vodafoneidea.com/content/dam/vodafone-idea/web/home-page/banner3.jpg")
        ),


        Company(

            companyName = "OnePlus",
            nameOfCEO = "Pete Lau",
            companyFounder = "Pete Lau and Carl Pei",
            year = "December 2013",
            about = "OnePlus is a Chinese consumer electronics company that primarily manufactures smartphones, along with other products such as televisions and audio accessories. It was founded in December 2013 by Pete Lau and Carl Pei, and is headquartered in Shenzhen, Guangdong, China. OnePlus is known for offering flagship-level features at relatively lower prices compared to other smartphone brands.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/OP_LU_Reg_1L_RGB_red_copy-01.svg/220px-OP_LU_Reg_1L_RGB_red_copy-01.svg.png",
            careerPageLink = "https://oneplus.keka.com/careers/",
            companyDomain = "Consumer electronics",
            companyProducts = "Smartphones, televisions, audio accessories",
            companyImages = listOf("https://www.oneplus.com/assets/seo/seo-logo-1200-675.png", "https://www.oneplus.com/assets/seo/seo-social.png")
        ),


        Company(

            companyName = "Vivo Communication Technology Co. Ltd.",
            nameOfCEO = "Shen Wei",
            companyFounder = "Dongguan-based BBK Electronics",
            year = "2009",
            about = "Vivo is a Chinese technology company that designs and develops smartphones, smartphone accessories, software, and online services. The company is known for producing high-quality and innovative smartphones with features such as high-quality cameras and long battery life.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Vivo_logo_2019.svg/200px-Vivo_logo_2019.svg.png",
            careerPageLink = "https://www.vivo.com/in/about-vivo/career/jobs?from=1",
            companyDomain = "Consumer electronics",
            companyProducts = "Smartphones, Smartphone Accessories",
            companyImages = listOf("https://www.vivo.com/in/common/images/header/vivo-logo.png", "https://cdn.vivo.com/static/www/vivo/common/images/index/picture-11.jpg")

        ),
        Company(

            companyName = "Xiaomi Corporation",
            nameOfCEO = "Lei Jun",
            companyFounder = "Lei Jun, Lin Bin",
            year = "2010",
            about = "Xiaomi Corporation is a Chinese multinational electronics company founded in April 2010 and headquartered in Beijing. Xiaomi makes and invests in smartphones, mobile apps, laptops, home appliances, bags, shoes, consumer electronics, and many other products.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Xiaomi_logo_%282021-%29.svg/100px-Xiaomi_logo_%282021-%29.svg.png",
            careerPageLink = "https://www.mi.com/global/careers/list",
            companyDomain = "Consumer electronics",
            companyProducts = "Smartphones, laptops, home appliances, consumer electronics",
            companyImages = listOf()
        ),


        Company(
            companyName = "Byju's",
            nameOfCEO = "Byju Raveendran",
            companyFounder = "Byju Raveendran",
            year = "2011",
            about = "Byju's is an Indian educational technology (edtech) and online tutoring firm founded in 2011 by Byju Raveendran. The company's learning app, Byju's - The Learning App, was launched in 2015 and has since become India's largest edtech company. Byju's offers a wide range of educational programs for K-12 students, as well as competitive exam preparation for engineering, banking, and other professional fields. Byju's has raised over $3 billion in funding and is valued at over $16.5 billion as of 2022.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Byju%27s_logo.svg/220px-Byju%27s_logo.svg.png",
            careerPageLink = "https://byjus.com/careers/",
            companyDomain = "Edtech",
            companyProducts = "Byju's - The Learning App, Byju's Classes, Byju's Online Tutoring, Byju's Test Prep",
            companyImages = listOf()
        ),


        Company(

            companyName = "Qualcomm Incorporated",
            nameOfCEO = "Cristiano Amon",
            companyFounder = "Irwin M. Jacobs, Andrew Viterbi, and six others",
            year = "1985",
            about = "Qualcomm is an American multinational semiconductor and telecommunications equipment company that designs and markets wireless telecommunications products and services. The company is a world leader in 3G, 4G, and next-generation wireless technologies, and it has developed numerous wireless technologies, including the popular CDMA and LTE standards used in smartphones. Qualcomm is headquartered in San Diego, California, and has operations in more than 40 countries around the world.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Qualcomm-Logo.svg/220px-Qualcomm-Logo.svg.png",
            careerPageLink = "https://www.qualcomm.com/company/careers",
            companyDomain = "Telecoms equipments Semiconductors",
            companyProducts = "Snapdragon processors, wireless modems, RF chips, Qualcomm Quick Charge, Qualcomm aptX audio, Qualcomm Atheros, Qualcomm Gobi, Qualcomm Snapdragon Wear, and more.",
            companyImages = listOf("https://www.qualcomm.com/themes/custom/qualcomm/images/logo.png", "https://www.qualcomm.com/sites/ember/files/styles/large/public/migration/2017/04/11/qualcomm-inc.jpg", "https://www.qualcomm.com/sites/ember/files/styles/featured/public/hero-banners/home-slider/5g-for-all-2250x1266-v2.jpg?itok=6m58unz7")
        ),

        Company(

            companyName = "Walmart Inc.",
            nameOfCEO = "Doug McMillon",
            companyFounder = "Sam Walton",
            year = "1962",
            about = "Walmart is an American multinational retail corporation that operates a chain of hypermarkets, discount department stores, and grocery stores. The company is headquartered in Bentonville, Arkansas and was founded by Sam Walton in 1962. Walmart is the world's largest company by revenue and employs over 2.3 million people worldwide.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Walmart_logo.svg/220px-Walmart_logo.svg.png",
            careerPageLink = "https://careers.walmart.com/",
            companyDomain = "Retail",
            companyProducts = "Hypermarkets, discount department stores, grocery stores, e-commerce",
            companyImages = listOf("https://www.walmart.com/images/logo_walmart.svg",
                "https://corporate.walmart.com/media-library/document/corporate-fact-sheet/_proxyImage/https/corporate.walmart.com/_next/static/images/corporate_fact_sheet-5d88c425b7e86e4976f0d36a56ec429c.png",
                "https://assets.simpleviewinc.com/simpleview/image/fetch/c_fill,h_691,q_75,w_1300/https://assets.simpleviewinc.com/simpleview/image/upload/crm/bentonvilleusa/4936bf6017c4411a04700435.png")
        ),


        Company(

            companyName = "VMware, Inc.",
            nameOfCEO = "Raghu Raghuram",
            companyFounder = "Diane Greene, Mendel Rosenblum, Scott Devine, Edward Wang, Edouard Bugnion",
            year = "1998",
            about = "VMware is a software company that provides cloud computing and virtualization software and services. Its products and services help organizations modernize their IT infrastructure, build and manage cloud-native applications, and secure and govern multi-cloud environments. VMware was a subsidiary of Dell Technologies until December 2021 when it was spun off as an independent company. It is headquartered in Palo Alto, California.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Vmware.svg/220px-Vmware.svg.png",
            careerPageLink = "https://careers.vmware.com/main/",
            companyDomain = "Cloud computing, Virtualization, Computer software",
            companyProducts = "Virtualization software, Cloud computing software, Networking and security software, Digital workspace software",
            companyImages = listOf("https://www.vmware.com/content/dam/digitalmarketing/vmware/en/images/common/logo/vmware-black-130x24.png", "https://www.vmware.com/content/dam/digitalmarketing/vmware/en/images/homepage/hero/vmw-home-hero-18q4-geneva-desktop.jpg", "https://www.vmware.com/content/dam/digitalmarketing/vmware/en/images/homepage/tiles/2022-q1-campaign-hp-banner-it.jpg")
        ),



        Company(

            companyName = "Booking.com",
            nameOfCEO = "Glenn Fogel",
            companyFounder = "Geert-Jan Bruinsma",
            year = "1996",
            about = "Booking.com is a travel metasearch engine for lodging reservations. It is owned and operated by United States-based Booking Holdings and is headquartered in Amsterdam. The website has over 28 million listings in 228 countries and territories worldwide. In 2019, Booking.com accounted for more than two-thirds of Booking Holdings' total revenue.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Booking.com_logo.svg/220px-Booking.com_logo.svg.png",
            careerPageLink = "https://careers.booking.com/",
            companyDomain = "Travel and accommodation services",
            companyProducts = "Booking.com offers various types of accommodations including hotels, apartments, villas, hostels, and resorts.",
            companyImages = listOf()
        ),


        Company(

            companyName = "Nike",
            nameOfCEO = "John Donahoe",
            companyFounder = "Bill Bowerman and Phil Knight",
            year = "1964",
            about = "Nike is an American multinational corporation that is engaged in the design, development, manufacturing, and worldwide marketing and sales of footwear, apparel, equipment, accessories, and services. The company is headquartered near Beaverton, Oregon, in the Portland metropolitan area. It is one of the world's largest suppliers of athletic shoes and apparel and a major manufacturer of sports equipment, with revenue in excess of US$37.4 billion in its fiscal year 2020 (ending May 31, 2020).",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Logo_NIKE.svg/1200px-Logo_NIKE.svg.png",
            careerPageLink = "https://jobs.nike.com/",
            companyDomain = "Textile, footwear",
            companyProducts = "Footwear, apparel, equipment, accessories, and services",
            companyImages = listOf("https://www.nike.com/help/aq-about-nike/how-we-design-and-create-products/images/nike-product.jpg",
                "https://static.highsnobiety.com/thumbor/G2QyS65bswv3Mq3KzfMxLht4eTw=/fit-in/480x320/smart/static.highsnobiety.com/wp-content/uploads/2021/04/19125659/nike-profound-aesthetic-offspring-baby-blue-blazer-release-date-price-01.jpg",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/nike-dunk-low-laser-crimson-sneakers-release-1618512706.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSv4iK1nkVcyYR8ayl7CvRcFXapP7s_RKz8aQ&usqp=CAU")
        ),



        Company(


            companyName = "Puma SE",
            nameOfCEO = "Bjørn Gulden",
            companyFounder = "Rudolf Dassler",
            year = "1948",
            about = "Puma is a German multinational corporation that designs and manufactures athletic and casual footwear, apparel and accessories. The company is headquartered in Herzogenaurach, Bavaria, Germany.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Puma-logo-%28text%29.svg/220px-Puma-logo-%28text%29.svg.png",
            careerPageLink = "https://about.puma.com/en/careers",
            companyDomain = "Textile, footwear",
            companyProducts = "Athletic and casual footwear, apparel and accessories",
            companyImages = listOf("https://www.puma.com/dw/image/v2/aagl_prd/on/demandware.static/-/Sites/default/dwa3c6da95/images/hi-res/381636_01/sv01/fnd/IND/fmt/png-alpha/w/900/h/900/plain_bg/ffffff", "https://www.puma.com/dw/image/v2/aagl_prd/on/demandware.static/-/Sites/default/dwc9f78410/images/hi-res/192776_01/sv01/fnd/IND/fmt/png-alpha/w/900/h/900/plain_bg/ffffff", "https://www.puma.com/dw/image/v2/aagl_prd/on/demandware.static/-/Sites/default/dw8a5b5bb5/images/hi-res/194586_01/sv01/fnd/IND/fmt/png-alpha/w/900/h/900/plain_bg/ffffff")
        ),

        Company(

            companyName = "Adidas",
            nameOfCEO = "Kasper Rørsted",
            companyFounder = "Adolf Dassler",
            year = "1949",
            about = "Adidas is a multinational corporation based in Germany that designs and manufactures athletic and casual footwear, apparel, and accessories. The company is one of the largest sportswear manufacturers in the world and has a strong presence in the global market. Adidas' products are marketed under various brand names, including Adidas, Reebok, and TaylorMade-Adidas Golf.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Adidas-group-logo-fr.svg/220px-Adidas-group-logo-fr.svg.png",
            careerPageLink = "https://careers.adidas-group.com/",
            companyDomain = "Textile, footwear",
            companyProducts = "Athletic and casual footwear, apparel, and accessories",
            companyImages = listOf("https://www.adidas-group.com/static/version1629104646/frontend/AdidasGroup/default/en_US/images/brand-logos/adidas-logo.png", "https://www.adidas-group.com/static/version1629104646/frontend/AdidasGroup/default/en_US/images/brand-logos/reebok-logo.png")
        ),


        Company(
            companyName = "Expedia Group",
            nameOfCEO = "Peter Kern (acting CEO)",
            companyFounder = "Rich Barton, Lloyd Frink",
            year = "1996",
            about = "Expedia Group is one of the world's leading travel technology companies. It operates a global network of online travel brands, offering travelers a wide range of travel options and services, from flights and hotels to rental cars, cruises, and vacation packages. Expedia Group's brands include Expedia, Hotels.com, Vrbo, Orbitz, Travelocity, Hotwire, Wotif, ebookers, CheapTickets, and many others.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Expedia_Group_logo.svg/220px-Expedia_Group_logo.svg.png",
            careerPageLink = "https://lifeatexpediagroup.com/",
            companyDomain = "Travel technology",
            companyProducts = "Online travel booking services, travel technology, travel content, and advertising solutions",
            companyImages = listOf("")
        ),


        Company(

            companyName = "AnyDesk",
            nameOfCEO = "Philipp Weiser",
            companyFounder = "Philipp Weiser and Andreas Mähler",
            year = "2014",
            about = "AnyDesk is a remote desktop software that allows users to access and control remote computers from anywhere in the world. It provides secure and reliable remote desktop connections for professionals and individuals. The company is headquartered in Stuttgart, Germany.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/AnyDesk-logo.svg/1920px-AnyDesk-logo.svg.png",
            careerPageLink = "https://anydesk.com/jobs",
            companyDomain = "Remote desktop software",
            companyProducts = "AnyDesk Remote Desktop software",
            companyImages = listOf("https://www.anydesk.com/-/media/anydesk/images/screenshots/remote-access-software-anydesk-1.jpg","https://www.anydesk.com/-/media/anydesk/images/screenshots/remote-access-software-anydesk-4.jpg","https://www.anydesk.com/-/media/anydesk/images/screenshots/remote-access-software-anydesk-2.jpg"
            )
        ),

        Company(

            companyName = "Postman",
            nameOfCEO = "Abhinav Asthana",
            companyFounder = "Abhinav Asthana, Ankit Sobti, and Abhijit Kane",
            year = "2014",
            about = "Postman is a collaboration platform for API development, used by millions of developers and companies worldwide. Postman simplifies each step of the API lifecycle and streamlines collaboration so you can create better APIs—faster.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/c/c2/Postman_%28software%29.png",
            careerPageLink = "https://www.postman.com/company/careers/",
            companyDomain = "postman.com",
            companyProducts = "Postman API Platform, Postman Learning Center, Postman Galaxy",
            companyImages = listOf("https://www.postman.com/wp-content/uploads/2021/04/hero.png",
                "https://www.postman.com/wp-content/uploads/2021/03/Postman-product-screenshot2.png",
                "https://www.postman.com/wp-content/uploads/2021/03/Postman-product-screenshot1.png")
        ),


        Company(

            companyName = "Capita",
            nameOfCEO = "Jon Lewis",
            companyFounder = "Rod Aldridge",
            year = "1984",
            about = "Capita is a British multinational corporation that provides customer management, administration, and professional support services to clients in a range of sectors. It has over 70,000 employees across the UK, Europe, South Africa, and India. The company is headquartered in London, UK.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/en/thumb/9/95/Capita_logo_%282019%29.svg/1920px-Capita_logo_%282019%29.svg.png",
            careerPageLink = "https://www.capita.com/careers",
            companyDomain = "Business process, outsourcing, Professional services",
            companyProducts = "Customer management, administration, and professional support services",
            companyImages = listOf("https://www.capita.com/themes/custom/capita_2019/logo.png", "https://www.capita.com/themes/custom/capita_2019/images/our-company/Capita-Ourservices-Hero.jpg")
        ),

        Company(

            companyName = "KPMG",
            nameOfCEO = "Bill Thomas",
            companyFounder = "Klynveld Main Goerdeler (KMG)",
            year = "1987",
            about = "KPMG is a multinational professional services network that provides audit, tax and advisory services. It is one of the largest professional services companies in the world and is considered one of the Big Four accounting firms, along with Deloitte, EY and PwC.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/KPMG_logo.svg/800px-KPMG_logo.svg.png",
            careerPageLink = "https://kpmg.com/in/en/home/careers.html",
            companyDomain = "Professional services",
            companyProducts = "Audit, Tax, and Advisory Services",
            companyImages = listOf("")
        ),

        Company(

            companyName = "Deloitte",
            nameOfCEO = "Punit Renjen",
            companyFounder = "William Welch Deloitte",
            year = "1845",
            about = "Deloitte is one of the world's largest professional services firms, providing audit, tax, consulting, and financial advisory services. It operates in more than 150 countries and territories, with more than 330,000 professionals.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Deloitte.svg/800px-Deloitte.svg.png",
            careerPageLink = "https://www2.deloitte.com/global/en/careers.html",
            companyDomain = "Professional services",
            companyProducts = "Audit, Consulting, Financial Advisory, Risk Advisory, Tax",
            companyImages = listOf("https://www2.deloitte.com/content/dam/deloitte/global/images/general/hero-images/gx-2022-about-us-hero-banner-2880x1200.jpg/_jcr_content/renditions/cq5dam.web.1440.597.jpeg")
        ),

        Company(

            companyName = "EY",
            nameOfCEO = "Carmine Di Sibio",
            companyFounder = "Arthur Young and Alwin C. Ernst",
            year = "1989",
            about = "EY (Ernst & Young) is a multinational professional services firm providing a range of services including audit, tax, consulting, and advisory services. The company has headquarters in London, UK and over 700 offices in more than 150 countries worldwide. EY serves a diverse range of clients, including public and private companies, governments, and non-profit organizations.",
            companyLogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/EY_logo_2019.svg/800px-EY_logo_2019.svg.png",
            careerPageLink = "https://www.ey.com/en_gl/careers",
            companyDomain = "Professional services",
            companyProducts = "Audit, Assurance, Tax, Advisory, Transaction Advisory Services, Consulting",
            companyImages = listOf(" https://www.ey.com/en_gl/newsroom/news-releases/news-ey-named-one-of-worlds-most-attractive-employers-for-fourth-consecutive-year-by-universum")
        ),

        Company(
                companyName = "Razorpay",
                        nameOfCEO = "Harshil Mathur",
                companyFounder = "Harshil Mathur and Shashank Kumar",
                year = "2013",
                about = "Razorpay is a leading online payment gateway company based in India. It provides a secure and easy-to-use payment solution to businesses of all sizes. Razorpay's products include Payment Gateway, Payment links, Subscription payment, Payment gateway for international payments, etc.",
                companyLogo = "https://signdesk.com/images/razorpay_logo.png",
                careerPageLink = "https://razorpay.com/jobs/jobs-all/?location=all&department=",
                companyDomain = "Fintech",
                companyProducts = "Payment Gateway, Payment links, Subscription payment, Payment gateway for international payments, etc.",
                companyImages = listOf("https://www.razorpay.com/www/assets/images/home-bg.png",
        "https://www.razorpay.com/www/assets/images/homepage-illustration.jpg",
        "https://www.razorpay.com/www/assets/images/banners/merchant-loan-1.jpg")
    )
    )


}