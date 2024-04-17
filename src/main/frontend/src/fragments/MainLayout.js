import React from 'react';
import { CommentOutlined, UserOutlined, GroupOutlined, MailOutlined } from '@ant-design/icons';
import { Breadcrumb, Layout, Menu, theme } from 'antd';
const { Header, Content, Sider } = Layout;

const menu = [ '내 정보', '구성도', '게시판', '메일']
const icons = [UserOutlined, GroupOutlined, CommentOutlined, MailOutlined]
const items1 =menu.map(key => ({
    key,
    label: key,
}));
const sideMenu = menu.map((key, index )=>({
    key,
    label : key,
    icon: React.createElement(icons[index]),
    children: new Array(4). fill(null).map((_, j) =>{
        const subValue = j+1;
        return {
            key : subValue,
            label: `sub${subValue}`
        }
    })

}));
// const items2 = [UserOutlined, GroupOutlined, CommentOutlined, MailOutlined].map((icon, index) => {
//     const key = menu[index-1 + 1];
//     return {
//         key: `sub${key}`,
//         icon: React.createElement(icon),
//         label: `${key}`,
//         // children: new Array(4).fill(null).map((_, j) => {
//         //     const subKey = index * 4 + j + 1;
//         //     return {
//         //         key: subKey,
//         //         label: `option${subKey}`,
//         //     };
//         // }),
//     };
// });
const App = () => {
    const {
        token: { colorBgContainer, borderRadiusLG },
    } = theme.useToken();
    return (
        <Layout>
            <Header
                style={{
                    display: 'flex',
                    alignItems: 'center',
                }}
            >
                <div className="demo-logo" />
                <Menu
                    theme="dark"
                    mode="horizontal"
                    defaultSelectedKeys={['2']}
                    items={items1}
                    style={{
                        flex: 1,
                        minWidth: 0,
                    }}
                />
            </Header>
            <Layout>
                <Sider
                    width={200}
                    style={{
                        background: colorBgContainer,
                    }}
                >
                    <Menu
                        mode="inline"
                        defaultSelectedKeys={['1']}
                        defaultOpenKeys={['sub1']}
                        style={{
                            height: '100%',
                            borderRight: 0,
                        }}
                        items={sideMenu}
                    />
                </Sider>
                <Layout
                    style={{
                        padding: '0 24px 24px',
                    }}
                >
                    <Breadcrumb
                        style={{
                            margin: '16px 0',
                        }}
                    >
                        <Breadcrumb.Item>Home</Breadcrumb.Item>
                        <Breadcrumb.Item>List</Breadcrumb.Item>
                        <Breadcrumb.Item>MainLayout</Breadcrumb.Item>
                    </Breadcrumb>
                    <Content
                        style={{
                            padding: 24,
                            margin: 0,
                            minHeight: 800,
                            background: colorBgContainer,
                            borderRadius: borderRadiusLG,
                        }}
                    >
                        Content
                    </Content>
                </Layout>
            </Layout>
        </Layout>
    );
};
export default App;