import {TopBar} from "../components/TopBar.tsx";
import {Box} from "@mui/material";
import {DataGrid, type GridColDef} from "@mui/x-data-grid";

export function MainPage() {

    const incomeColumns: GridColDef[] = [
        {
            field: 'description',
            headerName: 'Description',
            width: 200
        },
        {
            field: 'amount',
            headerName: 'Amount',
            width: 300
        },
    ];

    return (
        <Box>
            <TopBar></TopBar>
            <Box display={'grid'} gridTemplateRows='1fr 1fr' gap={2}>
                <DataGrid sx={{height: '100%', width: '100%'}} columns={incomeColumns}>

                </DataGrid>
                <DataGrid sx={{height: '100%', width: '100%'}} columns={incomeColumns}>

                </DataGrid>
            </Box>
        </Box>
    )
}