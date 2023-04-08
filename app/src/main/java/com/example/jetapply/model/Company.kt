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

//        Company(
//            companyName = "",
//            nameOfCEO = "",
//            companyFounder = "",
//            year = "",
//            about = "",
//            companyLogo = "",
//            careerPageLink = "",
//            companyDomain = "",
//            companyProducts = "",
//            companyImages = listOf(
//
//            )
//
//        ),

    )
}