import {AppBar, Box, Button, Toolbar} from "@mui/material";

export function TopBar() {
    return (
        <Box>
            <AppBar position="absolute">
                <Toolbar>
                    <Box>
                        <Button sx={{ color: "white", flex: 1 }}>Income</Button>
                        <Button sx={{ color: "white", flex: 1 }}>Expenses</Button>
                    </Box>
                </Toolbar>
            </AppBar>
        </Box>
    )
}