create database [Minics]
USE [Minics]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[Fullname] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[Photo] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Customers] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Authorities]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Authorities](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[RoleId] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_UserRoles] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[Id] [char](4) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[OrderId] [bigint] NOT NULL,
	[ProductId] [int] NOT NULL,
	[Price] [float] NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_OrderDetails] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[CreateDate] [datetime] NOT NULL,
	[Address] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Image] [nvarchar](50) NOT NULL,
	[Price] [float] NOT NULL,
	[CreateDate] [date] NOT NULL,
	[Available] [bit] NOT NULL,
	[CategoryId] [char](4) NOT NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Roles]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Roles](
	[Id] [nvarchar](10) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Roles] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[students]    Script Date: 7/20/2023 7:33:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[students](
	[email] [varchar](255) NOT NULL,
	[country] [varchar](255) NULL,
	[fullname] [varchar](255) NULL,
	[gender] [bit] NULL,
	[marks] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo]) VALUES (N'KietPhan', N'12345', N'Phan Huỳnh Tuấn Kiệt', N'kietphan@gmail.com', N'user.png')
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo]) VALUES (N'DuyKhanh', N'12345', N'Duy Khánh', N'duykhanh@gmail.com', N'user.png')
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo]) VALUES (N'XuanCuong', N'12345', N'Nguyễn Xuân Cường', N'xuancuong@gmail.com', N'user.png')
GO
SET IDENTITY_INSERT [dbo].[Authorities] ON 

INSERT [dbo].[Authorities] ([Id], [Username], [RoleId]) VALUES (2, N'KietPhan', N'STAF')
INSERT [dbo].[Authorities] ([Id], [Username], [RoleId]) VALUES (3, N'DuyKhanh', N'CUST')
INSERT [dbo].[Authorities] ([Id], [Username], [RoleId]) VALUES (4, N'XuanCuong', N'CUST')
SET IDENTITY_INSERT [dbo].[Authorities] OFF
GO

INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1000', N'Camera Canon EOS 550D')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1001', N'FLYDIGI')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1002', N'Camera Lens')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1003', N'Flycam')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1004', N'Camera')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1005', N'Bluetooth Speaker')
INSERT [dbo].[Categories] ([Id], [Name]) VALUES (N'1001', N'XBOX Series')
GO
SET IDENTITY_INSERT [dbo].[Products] ON 
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreateDate], [Available], [CategoryId]) VALUES (1001, N'Aniseed Syrup', N'1001.jpg', 190, CAST(0xD6070B00 AS Date), 0, N'1000')
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreateDate], [Available], [CategoryId]) VALUES (1002, N'Change', N'1002.jpg', 19, CAST(0xB80B0B00 AS Date), 0, N'1000')
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreateDate], [Available], [CategoryId]) VALUES (1003, N'Aniseed Syrup', N'1003.jpg', 10, CAST(0x26FE0A00 AS Date), 1, N'1001')
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreateDate], [Available], [CategoryId]) VALUES (1004, N'Chef Anton''s Cajun Seasoning', N'1004.jpg', 22, CAST(0x0E020B00 AS Date), 0, N'1001')
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [CreateDate], [Available], [CategoryId]) VALUES (1005, N'Chef Anton''s Gumbo Mix', N'1005.jpg', 21.35, CAST(0xF7050B00 AS Date), 1, N'1002')
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 
INSERT [dbo].[Orders] ([Id], [Username], [CreateDate], [Address]) VALUES (10249, N'DuyKhanh', CAST(0x000089B100000000 AS DateTime), N'HCM')
INSERT [dbo].[Orders] ([Id], [Username], [CreateDate], [Address]) VALUES (10250, N'XuanCuong', CAST(0x000089B400000000 AS DateTime), N'HCM')
INSERT [dbo].[Orders] ([Id], [Username], [CreateDate], [Address]) VALUES (10251, N'DuyKhanh', CAST(0x000089B400000000 AS DateTime), N'HCM')
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetails] ON 
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100005, 10249, 1001, 42.4, 40)
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100006, 10250, 1001, 7.7, 10)
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100007, 10250, 1003, 42.4, 35)
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100008, 10250, 1005, 16.8, 15)
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100009, 10251, 1004, 16.8, 6)
INSERT [dbo].[OrderDetails] ([Id], [OrderId], [ProductId], [Price], [Quantity]) VALUES (100010, 10251, 1002, 15.6, 15)
SET IDENTITY_INSERT [dbo].[OrderDetails] OFF
GO
INSERT [dbo].[Roles] ([Id], [Name]) VALUES (N'CUST', N'Customers')
INSERT [dbo].[Roles] ([Id], [Name]) VALUES (N'DIRE', N'Directors')
INSERT [dbo].[Roles] ([Id], [Name]) VALUES (N'STAF', N'Staffs')
GO
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'cuongnx@fpt.edu.vn', N'VN', N'Nguyen Xuan Cuong', 1, 10)
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'kietpht@fpt.edu.vn', N'EN', N'Phan Huynh Tuan Kiet', 1, 10)
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'chuongnh@fpt.edu.vn', N'SK', N'Nguy?n Hoàng Chuong', 1, 8)
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'nhatht@fpt.edu.vn', N'US', N'Tran Ha Thanh Nha', 0, 9.5)
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'thanhnc@fpt.edu.vn', N'US', N'Nguy?n Chí Thanh', 1, 7)
INSERT [dbo].[students] ([email], [country], [fullname], [gender], [marks]) VALUES (N'vytl@fpt.edu.vn', N'EN', N'Luong Tuan Vy', 1, 10)
GO

ALTER TABLE [dbo].[Accounts] ADD  CONSTRAINT [DF_Customers_Photo]  DEFAULT (N'Photo.gif') FOR [Photo]
GO
ALTER TABLE [dbo].[OrderDetails] ADD  CONSTRAINT [DF_Order_Details_UnitPrice]  DEFAULT ((0)) FOR [Price]
GO
ALTER TABLE [dbo].[OrderDetails] ADD  CONSTRAINT [DF_Order_Details_Quantity]  DEFAULT ((1)) FOR [Quantity]
GO
ALTER TABLE [dbo].[Orders] ADD  CONSTRAINT [DF_Orders_OrderDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Products] ADD  CONSTRAINT [DF_Products_Image]  DEFAULT (N'Product.gif') FOR [Image]
GO
ALTER TABLE [dbo].[Products] ADD  CONSTRAINT [DF_Products_UnitPrice]  DEFAULT ((0)) FOR [Price]
GO
ALTER TABLE [dbo].[Products] ADD  CONSTRAINT [DF_Products_ProductDate]  DEFAULT (getdate()) FOR [CreateDate]
GO
ALTER TABLE [dbo].[Products] ADD  CONSTRAINT [DF_Products_Available]  DEFAULT ((1)) FOR [Available]
GO
ALTER TABLE [dbo].[Authorities]  WITH CHECK ADD  CONSTRAINT [FK_UserRoles_Roles] FOREIGN KEY([RoleId])
REFERENCES [dbo].[Roles] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Authorities] CHECK CONSTRAINT [FK_UserRoles_Roles]
GO
ALTER TABLE [dbo].[Authorities]  WITH CHECK ADD  CONSTRAINT [FK_UserRoles_Users] FOREIGN KEY([Username])
REFERENCES [dbo].[Accounts] ([Username])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Authorities] CHECK CONSTRAINT [FK_UserRoles_Users]
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Orders] FOREIGN KEY([OrderId])
REFERENCES [dbo].[Orders] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Orders]
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Products] FOREIGN KEY([ProductId])
REFERENCES [dbo].[Products] ([Id])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Products]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Customers] FOREIGN KEY([Username])
REFERENCES [dbo].[Accounts] ([Username])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Customers]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK3ess0s7i9qs6sim1pf9kxhkpq] FOREIGN KEY([CategoryId])
REFERENCES [dbo].[Categories] ([Id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK3ess0s7i9qs6sim1pf9kxhkpq]
GO
